package jpl.beerchallenge;

import java.util.List;

public class GameManager {
	private List<Game> games;

	public List<Game> getGamesList() {
		return games;
	}

	public Game getGame(String name) {
		for (Game g : games) {
			if (g.getTeamName().equals(name))
				return g;
		}
		return null;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}
	
	public void addGame(Game game) {
		games.add(game);
	}
}
