package jpl.beerchallenge;

import java.util.Date;

public class Player {
	
	private String name;
	private Date score;
	private int rank;
	
	public Player(String name){
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setScore(Date score) {
		this.score = score;
	}
	
	public Date getScore() {
		return score;
	}
	
	public void setRank(int rank){
		this.rank = rank;
	}
	
	public int getRank() {
		return rank;
	}
	
	public String toString(){
		return "Player [rank=" + rank + ", name=" + name + ", score: " + score + "]";
	}

}
