package jpl.beerchallenge.domain;

import java.util.Arrays;

import javax.persistence.*;

import jpl.beerchallenge.converter.JSONConverter;

@Entity
@Table(name="Player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
	private String name;
	
	@Convert(converter = JSONConverter.class)
	private int[] score;
		
	@ManyToOne(fetch=FetchType.EAGER, cascade=(CascadeType.ALL))
	private Game game;
	
	private String status = "UNKNOWN";
	
	public Player() {
		
	}

	public Player(String name){
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setScore(int[] score) {
		this.score = score;
		
		if (score[59] != -1)
			setStatus("WINNER");
		else
			setStatus("LOSER");
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
	
	public void setStatus(String status){
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String toString(){
		return "Player [id=" + id + ", name=" + name + ", score=" + Arrays.toString(score) + ", status=" + status + "]";
	}

}
