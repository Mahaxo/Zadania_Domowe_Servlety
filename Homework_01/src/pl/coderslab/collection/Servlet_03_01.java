package pl.coderslab.collection;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_03_01
 */
@WebServlet("/Servlet_03_01")
public class Servlet_03_01 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("<a href=http://localhost:8080/Homework_01/Servlet_03_02?id=0&id=1&id=2&id=3&id=4&id=5&id=6&id=7>Servlet 2</a>");
	}


}
