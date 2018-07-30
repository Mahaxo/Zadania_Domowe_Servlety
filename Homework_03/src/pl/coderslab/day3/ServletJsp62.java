package pl.coderslab.day3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletJsp62
 */
@WebServlet("/ServletJsp62")
public class ServletJsp62 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session.isNew()) {
			List <String> visits = new ArrayList<>();
			visits.add("Strona 2");
			session.setAttribute("visits", visits);
		} else {
			List <String> visits = (List<String>) session.getAttribute("visits");
			visits.add("Strona 2");
			session.setAttribute("visits", visits);
			
		}
		
		request.getRequestDispatcher("WEB-INF/jsp/index62.jsp")
		.forward(request, response);
	}
}
    
