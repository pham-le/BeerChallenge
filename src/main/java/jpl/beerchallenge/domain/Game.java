package jpl.beerchallenge.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String teamName;
	
	private int numPeople;
	
	@OneToMany
	(mappedBy="game", targetEntity=Player.class, cascade=(CascadeType.REMOVE))
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
	
	public void setPlayers(String[] p) {
		for (String player : p) {
			players.add(new Player(player));
		}
	}

	public List<Player> getPlayers() {
		return players;
	}

	public String toString() {
		String members = "";
		for (Player p : players) {
			members = members + "\t" + p.toString() + "\n";
		}

		return "Game [teamName=" + teamName + ", numPeople=" + numPeople + ", players=\n" + members + "]";
	}
}
