package jpl.beerchallenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jpl.beerchallenge.dao.GameDAO;
import jpl.beerchallenge.domain.Game;

@Service
public class GameServiceImpl implements GameService {
	
	@Autowired
	private GameDAO gameDAO;
	
	public void addGame(String teamName, int numPeople) {
		Game game = new Game(teamName, numPeople);
		gameDAO.addGame(game);
	}
	
	public void updateGame(Game game) {
		gameDAO.updateGame(game);
	}
	
	public Game getGame(int id) {
		return gameDAO.getGame(id);
	}
	
	public List<Game> getGames() {
		return gameDAO.getGames();
	}

	public boolean validateTeamName(String tname) {
		return tname.length() >= 3;
	}

	public boolean validateNumPeople(String numPeople) {
		if (numPeople.equals(""))
			return false;
		return Integer.parseInt(numPeople) >= 1;
	}
	
}
