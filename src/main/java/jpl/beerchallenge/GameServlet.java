package jpl.beerchallenge;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/home")
public class GameServlet extends HttpServlet {

	private GameService service = new GameService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String teamName = request.getParameter("teamName");
		String numPeople = request.getParameter("numPeople");

		boolean isValidName = service.validateTeamName(teamName);
		boolean isValidCount = service.validateNumPeople(numPeople);


		if (!isValidName || !isValidCount) {
			String errorMessage = "Error: ";
			if (!isValidName)
				errorMessage += "Team name does not contain 3 or more characters. ";

			if (!isValidCount)
				errorMessage += "Invalid player count. ";
			
			request.setAttribute("errorMessage", errorMessage);
			request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
		}

		if (isValidName && isValidCount) {
			request.setAttribute("teamName", request.getParameter("teamName"));
			request.setAttribute("numPeople", request.getParameter("numPeople"));
			request.getRequestDispatcher("/WEB-INF/views/configure.jsp").forward(request, response);
		}

	}

}