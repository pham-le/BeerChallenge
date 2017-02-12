package jpl.beerchallenge;

public class GameService {
	
	public boolean validateTeam(String name, String numPeople) {
		return (name.length() >= 3 && Integer.parseInt(numPeople) >= 1);
	}
}
