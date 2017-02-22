package jpl.beerchallenge;

import org.springframework.stereotype.Service;

@Service
public class GameService {
	
	public boolean validateTeamName(String name) {
		return name.length() >= 3;
	}
	
	public boolean validateNumPeople(String numPeople) {
		if (numPeople.equals(""))
			return false;
		return Integer.parseInt(numPeople) >= 1;
	}
}
