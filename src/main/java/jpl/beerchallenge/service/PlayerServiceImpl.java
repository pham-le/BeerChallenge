package jpl.beerchallenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jpl.beerchallenge.dao.PlayerDAO;
import jpl.beerchallenge.domain.Player;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerDAO playerDAO;

	public void addPlayer(Player player) {
		playerDAO.addPlayer(player);
	}

	public boolean validatePlayerName(String playerName) {
		return playerName.length() >= 2;
	}

	public void updatePlayer(Player player) {
		
		playerDAO.updatePlayer(player);
	}

	public Player getPlayer(int id) {
		return playerDAO.getPlayer(id);
	}

	public List<Player> getPlayers() {
		return playerDAO.getPlayers();
	}
}
