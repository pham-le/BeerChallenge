package jpl.beerchallenge;

import java.util.Date;

public class Game {

	private String teamName;
	private int numPeople;
	private Player[] players;
	private Date average;

	public Game(String teamName, int numPeople) {
		this.teamName = teamName;
		this.numPeople = numPeople;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setNumPeople(int numPeople) {
		this.numPeople = numPeople;
	}

	public int getNumPeople() {
		return numPeople;
	}

	public void setPlayers(String[] p) {
		players = new Player[numPeople];

		for (int i = 0; i < getNumPeople(); i++) {
			players[i] = new Player(p[i]);
		}
	}

	public Player[] getPlayers() {
		return players;
	}

	/**
	 * Set the average scores (times) of each player on the team.
	 * 
	 * Divide by some known quantity (e.g. 1000) to avoid overflow; this reduces
	 * the accuracy by a known amount (in this case to the second) but will fail
	 * if you have more than 1000 items
	 * 
	 */
	public void setAverage() {
		long totalSeconds = 0L;
		for (Player p : players) {
			totalSeconds += p.getScore().getTime() / 1000L;
		}
		long averageSeconds = totalSeconds / numPeople;
		average = new Date(averageSeconds * 1000L);
	}

	public Date getAverage() {
		return average;
	}

	public String toString() {
		return "[TEAM: " + getTeamName() + ", PLAYERS: " + getPlayers().toString() + "]";

	}
}
