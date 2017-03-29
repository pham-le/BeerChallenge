package jpl.beerchallenge.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jpl.beerchallenge.domain.Game;
import jpl.beerchallenge.domain.Player;
import jpl.beerchallenge.service.BeerService;

/**
 * @Controller annotation is an annotation used in Spring MVC framework (the
 *             component of Spring Framework used to implement Web Application).
 *             The @Controller annotation indicates that a particular class
 *             serves the role of a controller. The @Controller annotation acts
 *             as a stereotype for the annotated class, indicating its role. The
 *             dispatcher scans such annotated classes for mapped methods and
 *             detects @RequestMapping annotations.
 * 
 *             This class handles all the HTTP Requests and invokes business
 *             logic.
 * 
 * @author Jannette Pham-Le
 *
 */
@Controller
public class GameController {

	@Autowired // Dependency Injection
	private BeerService service;

	private Game game = new Game();

	/**
	 * GET Request
	 * 
	 * @return home page
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	// @ResponseBody (this annotation will print the return value on the page
	// mapped)
	public String showHomePage() {
		return "home";
	}

	/**
	 * POST Request: When an operator fills out the form on the home page
	 * correctly by submitting a POST request, they will be brought to the
	 * configure page.
	 * 
	 * @return configure page
	 */
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public ModelAndView handleHome(ModelMap model, @RequestParam String teamName, @RequestParam String numPeople) {

		boolean isValidName = service.validateTeamName(teamName);
		boolean isValidCount = service.validateNumPeople(numPeople);

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

		model.addAttribute("teamName", teamName);
		model.addAttribute("numPeople", numPeople);

		return new ModelAndView("configure", "model", model);
	}

	@RequestMapping(value = "/configure", method = RequestMethod.POST)
	public ModelAndView handleConfigure(ModelMap model, @RequestParam(value = "players[]") String[] players) {
		String pnameError = "";
		for (int i = 0; i < players.length; i++) {
			if (!service.validatePlayerName(players[i])) {
				pnameError = "Error: Player names must contain 2 or more characters.";
				model.addAttribute("pnameError", pnameError);
				return new ModelAndView("configure", "model", model);
			}
		}

		// add players into game object
		game.setPlayers(players);
		service.addGame(game);

		model.addAttribute("players", players);
		model.addAttribute("numPeople", players.length);
		model.addAttribute("teamName", game.getTeamName());

		return new ModelAndView("start", "model", model);
	}

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
		}
		
		return handleScoreBoard(model);
	}

	@RequestMapping(value = "/scoreboard", method = RequestMethod.GET)
	public ModelAndView handleScoreBoard(ModelMap model) {
		String now = (new java.util.Date()).toString();

		model.addAttribute("now", now);
		model.addAttribute("gameList", service.getGames());

		return new ModelAndView("scoreboard", "model", model);
	}
}
