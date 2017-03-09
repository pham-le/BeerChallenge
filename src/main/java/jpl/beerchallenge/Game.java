package jpl.beerchallenge;

public class Game {

	private String teamName;
	private int numPeople;
	private Player[] players;

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
	
	public void setPlayers(String[] p){
		players = new Player[getNumPeople()];
		
		//need to update
		for(int i = 0; i<getNumPeople(); i++) {
			
		}
		
	}
	
	public Player[] getPlayers(){
		return players;
	}
}
