package jpl.beerchallenge.dao;

import java.util.List;
import jpl.beerchallenge.domain.*;

public interface GameDAO {
	
	/* Game */
	public void addGame(Game game);
	public void updateGame(Game game);
	public Game getGame(int id);
	public List<Game> getGames();
	
	/* Player */
	public void addPlayer(Player player);
	public void updatePlayer(Player player);
	public Player getPlayer(int id);
	public List<Player> getPlayers();
	
}