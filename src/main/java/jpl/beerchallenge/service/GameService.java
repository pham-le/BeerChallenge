package jpl.beerchallenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jpl.beerchallenge.dao.GameDAOImpl;
import jpl.beerchallenge.domain.Game;

public interface GameService {
	
	public void addGame(String teamName, int numPeople);
	
	public void updateGame(Game game);
	
	public Game getGame(int id);
	
	public List<Game> getGames();

	public boolean validateTeamName(String tname);

	public boolean validateNumPeople(String numPeople);
	
}
