package jpl.beerchallenge;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GameController {

	/**
	 * GET Request
	 * 
	 * @return home page
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	// @ResponseBody (this annotation will print the return value on the page
	// mapped)
	public String showHomePage() {
		return "home";
	}

	/**
	 * POST Request: When an operator fills out the form on the home page
	 * correctly by submitting a POST request, they will be brought to the
	 * configure page.
	 * 
	 * @return configure page
	 */
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String handleHome(ModelMap model, @RequestParam String teamName, @RequestParam String numPeople) {
		model.put("teamName", teamName);
		model.put("numPeople", numPeople);
		return "configure";
	}
}
