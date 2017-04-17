package jpl.beerchallenge.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String teamName;
	
	private int numPeople;
	
	@OneToMany
	(mappedBy="game", targetEntity=Player.class, cascade=(CascadeType.ALL))
	private List<Player> players;

	public Game() {
		players = new ArrayList<Player>();
	}

	public Game(String teamName, int numPeople) {
		players = new ArrayList<Player>();
		this.teamName = teamName;
		this.numPeople = numPeople;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getNumPeople() {
		return numPeople;
	}
	
	public void setNumPeople(int numPeople) {
		this.numPeople = numPeople;
	}
	
	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public String toString() {
		String members = "";
		for (Player p : players) {
			members = members + p.toString() + ", ";
		}

		return "Game [id=" + id + ", teamName=" + teamName + ", numPeople=" + numPeople + ", players=\n" + players.toString() + "]";
	}
}
