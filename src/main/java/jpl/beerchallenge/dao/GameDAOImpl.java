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
public class GameDAOImpl implements GameDAO {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addGame(Game game) {
		getSession().save(game);
	}

	@Override
	public void updateGame(Game game) {
		getSession().merge(game);
	}

	@Override
	public Game getGame(int id) {
		List<Game> games = getGames();
		if (games.isEmpty())
			return null;
		
		for (Game g : games) {
			if (g.getId() == id) return g;
		}
		
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Game> getGames() {
        return getSession().createQuery("from Game").list();
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
			if (p.getId() == id) return p;
		}
		
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Player> getPlayers() {
        return getSession().createQuery("from Player").list();
	}

}
