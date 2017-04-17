package jpl.beerchallenge.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jpl.beerchallenge.domain.Game;
import jpl.beerchallenge.domain.Player;
import jpl.beerchallenge.service.GameService;
import jpl.beerchallenge.service.PlayerService;

/**
 * 
 * This class handles all the HTTP Requests and invokes business logic.
 * 
 * @author Jannette Pham-Le
 *
 */
@Controller
public class GameController {

	@Autowired
	private GameService gameService;

	@Autowired
	private PlayerService playerService;

	private Game game = new Game();

	/**
	 * Displays the home page of the game.
	 * 
	 * @return home page
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String showHomePage() {
		return "home";
	}

	/**
	 * When an operator fills out the form on the home page correctly by
	 * submitting a POST request, they will be brought to the configure page.
	 * 
	 * @param model
	 * @param teamName
	 * @param numPeople
	 * @return configure page
	 */
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public ModelAndView handleHome(ModelMap model, @RequestParam String teamName, @RequestParam String numPeople) {

		boolean isValidName = gameService.validateTeamName(teamName);
		boolean isValidCount = gameService.validateNumPeople(numPeople);

		if (!isValidName || !isValidCount) {
			String errorMessage = "Error: ";
			if (!isValidName)
				errorMessage += "Team name does not contain 3 or more characters. ";

			if (!isValidCount)
				errorMessage += "Invalid player count. ";

			model.put("errorMessage", errorMessage);
			return new ModelAndView("home", "model", model);
		}

		game = new Game(teamName, Integer.parseInt(numPeople));
		// gameService.addGame(teamName, Integer.parseInt(numPeople));

		model.addAttribute("teamName", teamName);
		model.addAttribute("numPeople", numPeople);

		return new ModelAndView("configure", "model", model);
	}

	/**
	 * When the operator fills out the form with all of the names of each player
	 * on the team correctly, they will be brought to the start page.
	 * 
	 * @param model
	 * @param players
	 * @return start page
	 */
	@RequestMapping(value = "/configure", method = RequestMethod.POST)
	public ModelAndView handleConfigure(ModelMap model, @RequestParam(value = "players[]") String[] players) {
		String errorMessage = "";
		for (String playerName : players) {
			if (!playerService.validatePlayerName(playerName)) {
				errorMessage = "Error: Player names must contain 2 or more characters.";
				model.addAttribute("errorMessage", errorMessage);
				return new ModelAndView("configure", "model", model);
			}
		}

		List<Player> playerList = new ArrayList<>();
		for (String playerName : players) {
			Player p = new Player(playerName);
			p.setGame(game);
			playerList.add(p);
			playerService.addPlayer(p);
		}
		game.setPlayers(playerList);

		model.addAttribute("players", players);
		model.addAttribute("numPeople", players.length);
		model.addAttribute("teamName", game.getTeamName());

		return new ModelAndView("start", "model", model);
	}

	/**
	 * Once the team decides to submit the final scores for each player, the
	 * scores will be saved into the database and the scoreboard page will be
	 * displayed.
	 * 
	 * @param model
	 * @param listOfScores
	 * @return
	 */
	@RequestMapping(value = "/start", method = RequestMethod.POST)
	public ModelAndView handleStart(ModelMap model, @RequestParam(value = "listOfScores") String[] listOfScores) {
		int[] intArray = new int[listOfScores.length];
		for (int i = 0; i < listOfScores.length; i++) {
			if (listOfScores[i].equals("")) {
				intArray[i] = -1;
			} else {
				intArray[i] = Integer.parseInt(listOfScores[i]);
			}
		}

		List<Player> players = game.getPlayers();
		for (int i = 0; i < players.size(); i++) {
			int[] score = new int[60];

			System.arraycopy(intArray, i * 60, score, 0, 60);
			players.get(i).setScore(score);
			playerService.updatePlayer(players.get(i));
		}

		return handleScoreBoard(model);
	}

	/**
	 * Details of each game is displayed on the scoreboard page.
	 * 
	 * @param model
	 * @return scoreboard page
	 */
	@RequestMapping(value = "/scoreboard", method = RequestMethod.GET)
	public ModelAndView handleScoreBoard(ModelMap model) {
		String now = (new java.util.Date()).toString();

		model.addAttribute("now", now);
		model.addAttribute("gameList", gameService.getGames());
		model.addAttribute("playerList", playerService.getPlayers());

		return new ModelAndView("scoreboard", "model", model);
	}

	/**
	 * Redirect to another page to display details of either a game or a player.
	 * 
	 * @param name
	 * @param type
	 * @return redirect URL
	 */
	@RequestMapping(value = "/scoreboard", method = RequestMethod.POST)
	public String displayDetails(@RequestParam(value = "name") String name, @RequestParam(value = "type") String type) {
		if (type.equals("teamName")) {
			return "redirect:/scoreboard/teamname=" + name;
		} else {
			return "redirect:/scoreboard/playername=" + name;
		}
	}

	/**
	 * Specific game details are displayed if the given user input matches a
	 * team's name within the database.
	 * 
	 * @param teamName
	 * @return
	 */
	@RequestMapping(value = "/scoreboard/teamname={teamName}", method = RequestMethod.GET, produces="text/plain")
	@ResponseBody
	public String findTeamName(@PathVariable String teamName) {
		String responseBody = "";
		for (Game g : gameService.getGames()) {
			if (g.getTeamName().equals(teamName)) {
				responseBody = responseBody + g.toString() + "\n\n";
			}
		}

		if (responseBody.equals(""))
			responseBody = "ERROR: Cannot find team(s) with name: " + teamName;

		return responseBody;
	}

	/**
	 * Specific player details are displayed if the given user input matches the
	 * player's name within the database.
	 * 
	 * @param playerName
	 * @return
	 */
	@RequestMapping(value = "/scoreboard/playername={playerName}", method = RequestMethod.GET, produces="text/plain")
	@ResponseBody
	public String findPlayer(@PathVariable String playerName) {
		String responseBody = "";
		for (Player p : playerService.getPlayers()) {
			if (p.getName().equals(playerName)) {
				responseBody = responseBody + p.toString() + "\n\n";
			}
		}

		if (responseBody.equals(""))
			responseBody = "ERROR: Cannot find player(s) with name: " + playerName;

		return responseBody;
	}
}
