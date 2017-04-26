package jpl.beerchallenge.dao;

import java.util.List;
import jpl.beerchallenge.domain.*;

public interface PlayerDAO {

	public void addPlayer(Player player);

	public void updatePlayer(Player player);

	public Player getPlayer(int id);

	public List<Player> getPlayers();

}