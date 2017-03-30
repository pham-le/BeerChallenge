package jpl.beerchallenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jpl.beerchallenge.dao.GameDAO;
import jpl.beerchallenge.domain.Player;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private GameDAO gameDAO;

	public void addPlayer(Player player) {
		gameDAO.addPlayer(player);
	}

	public boolean validatePlayerName(String playerName) {
		return playerName.length() >= 2;
	}

	public void updatePlayer(Player player) {
		
		gameDAO.updatePlayer(player);
	}

	public Player getPlayer(int id) {
		return gameDAO.getPlayer(id);
	}

	public List<Player> getPlayers() {
		return gameDAO.getPlayers();
	}
}
