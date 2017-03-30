package jpl.beerchallenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jpl.beerchallenge.dao.GameDAOImpl;
import jpl.beerchallenge.domain.Player;

@Service
public class PlayerService {
	
	@Autowired
	private GameDAOImpl dao;
	
	public boolean addPlayer(String playerName) {
		if (playerName.length() >=2) {
			Player p = new Player(playerName);
			dao.addPlayer(p);
		}
		
		return false;
	}

	public void updatePlayer(Player player) {
		dao.updatePlayer(player);
	}

	public Player getPlayer(int id) {
		return dao.getPlayer(id);
	}

	public List<Player> getPlayers() {
		return dao.getPlayers();
	}
}
