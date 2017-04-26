package jpl.beerchallenge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jpl.beerchallenge.domain.*;

@Repository
@Transactional
public class PlayerDAOImpl implements PlayerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addPlayer(Player player) {
		getSession().save(player);
	}

	@Override
	public void updatePlayer(Player player) {
		getSession().update(player);
	}

	@Override
	public Player getPlayer(int id) {
		List<Player> players = getPlayers();
		if (players.isEmpty())
			return null;

		for (Player p : players) {
			if (p.getId() == id)
				return p;
		}

		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Player> getPlayers() {
		return getSession().createQuery("from Player").list();
	}

}
