package jpl.beerchallenge;

public class Game {

	private String teamName;
	private int numPeople;
	private Player[] players;

	public Game(){
		
	}
	
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
	
	public String toString(){
		String members = "";
		for (Player p : players) {
			members = members + "\t" + p.toString() + "\n";
		}
		
		System.out.println(members);
		return "Game [teamName=" + teamName + ", numPeople=" + numPeople + ", players=\n" + members +"]";
	}
}
