package jpl.beerchallenge.dao;

import java.util.List;
import jpl.beerchallenge.domain.*;

public interface GameDAO {

	public void addGame(Game game);

	public void updateGame(Game game);

	public Game getGame(int id);

	public List<Game> getGames();

}