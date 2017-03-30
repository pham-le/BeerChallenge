package jpl.beerchallenge.service;

import java.util.List;

import jpl.beerchallenge.domain.Player;

public interface PlayerService {

	public boolean addPlayer(String playerName);

	public void updatePlayer(Player player);

	public Player getPlayer(int id);

	public List<Player> getPlayers();
	
}
