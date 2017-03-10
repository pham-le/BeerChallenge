package jpl.beerchallenge;

public class Game {

	private String teamName;
	private int numPeople;
	private Player[] players;

	public Game(String teamName, int numPeople) {
		this.teamName = teamName;
		this.numPeople = numPeople;
	}

	public String getTeamName() {
		return teamName;
	}

	public int getNumPeople() {
		return numPeople;
	}
	
	public void setPlayers(String[] p){
		players = new Player[numPeople];
		
		//need to update
		for(int i = 0; i<numPeople; i++) {
			players[i] = new Player(p[i]);
		}
		
	}
	
	public Player[] getPlayers(){
		return players;
	}
}
