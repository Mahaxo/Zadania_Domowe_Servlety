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
 * Servlet implementation class destroyer
 */
@WebServlet("/destroyer")
public class destroyer extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session.isNew()) {
			response.getWriter().append("Nie ma co niszczyc!");
		} else {
			session.invalidate();
			session = request.getSession();
			List <String> visits = new ArrayList<>();
			visits.add("niszczyciel");
			session.setAttribute("visits", visits);
		}
		request.getRequestDispatcher("WEB-INF/jsp/index64.jsp")
		.forward(request, response);
	}

	

}
