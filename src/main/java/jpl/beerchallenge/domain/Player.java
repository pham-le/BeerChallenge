package jpl.beerchallenge.domain;

import java.util.Arrays;

import javax.persistence.*;

@Entity
@Table(name="Player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
	private String name;
	
	private int[] score;
		
	@ManyToOne(fetch=FetchType.EAGER, cascade=(CascadeType.ALL))
	private Game game;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
	
	public void setGame(Game game){
		this.game = game;
	}
	
	public Game getGame() {
		return game;
	}
	
	public String toString(){
		return "Player [name=" + name + ", score: " + Arrays.toString(score) + "]";
	}

}
