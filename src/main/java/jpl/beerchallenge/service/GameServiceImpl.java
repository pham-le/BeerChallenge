package jpl.beerchallenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jpl.beerchallenge.dao.GameDAO;
import jpl.beerchallenge.domain.Game;

@Service("gameService")
public class GameServiceImpl implements GameService {
	
	@Autowired
	private GameDAO dao;
	
	public void addGame(String teamName, int numPeople) {
		Game game = new Game(teamName, numPeople);
		dao.addGame(game);
	}
	
	public void updateGame(Game game) {
		dao.updateGame(game);
	}
	
	public Game getGame(int id) {
		return dao.getGame(id);
	}
	
	public List<Game> getGames() {
		return dao.getGames();
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
