package jpl.beerchallenge.domain;

import java.util.Arrays;

public class Player {
	
	private String name;
	private int[] score;
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
	
	public void setScore(int[] score) {
		this.score = score;
	}
	
	public int[] getScore() {
		return score;
	}
	
	public void setRank(int rank){
		this.rank = rank;
	}
	
	public int getRank() {
		return rank;
	}
	
	public String toString(){
		return "Player [rank=" + rank + ", name=" + name + ", score: " + Arrays.toString(score) + "]";
	}

}
