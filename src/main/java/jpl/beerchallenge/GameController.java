package jpl.beerchallenge;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GameController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	//@ResponseBody
	public String showHomePage() {
		return "home";
	}	

	//@ResponseBody annotation will print the return value on the page mapped (/home)
}
