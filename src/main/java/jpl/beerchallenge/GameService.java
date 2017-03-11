package jpl.beerchallenge;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Service annotation is used in your service layer and annotates classes that
 *          perform service tasks. This class contains all the business logic.
 * 
 * @author Jannette Pham-Le
 *
 */
@Service
public class GameService {
	
	private List<Game> games = new LinkedList<>();

	public List<Game> getGames() {
		return games;
	}

	public void addGame(Game g) {
		games.add(g);
	}

	public void setGameList(List<Game> games) {
		this.games = games;
	}

	public boolean validateTeamName(String tname) {
		return tname.length() >= 3;
	}

	public boolean validateNumPeople(String numPeople) {
		if (numPeople.equals(""))
			return false;
		return Integer.parseInt(numPeople) >= 1;
	}

	public boolean validatePlayerName(String pname) {
		return pname.length() >= 2;
	}
}
