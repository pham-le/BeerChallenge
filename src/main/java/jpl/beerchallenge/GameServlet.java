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
    	
        request.setAttribute("teamName", teamName);
        request.setAttribute("numPeople", numPeople);
        //request.getRequestDispatcher("/WEB-INF/views/configure.jsp").forward(request, response);
        
        //Using GameService, check if valid fields
        if (service.validateTeam(teamName, numPeople)) {
            request.setAttribute("teamName", teamName);
            request.getRequestDispatcher("/WEB-INF/views/configure.jsp").forward(request, response);
        } else {
            request.setAttribute("errorMessage", "Error: Invalid Team Name or number of participants.");
            request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
        }
    }

}