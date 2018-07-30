package pl.coderslab.collection;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_04
 */
@WebServlet("/Servlet_04")
public class Servlet_04 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random rand = new Random();
		int low = 1;
		int high = 101;
		int result = 0;
		List <Integer> numbers = new ArrayList<>();
		for (int i = 0; i<10; i++) {
			result = rand.nextInt(high-low) + low;
			numbers.add(result);
		}
		response.getWriter().append("<table>" + "<tr>");
		for (Integer number: numbers) {
		response.getWriter().append("<td>" + number + "</td>");}
		response.getWriter().append("</tr>" + "</table");
		Collections.sort(numbers);
		response.getWriter().append("<table>" + "<tr>");
		for (Integer number: numbers) {
		response.getWriter().append("<td>" + number + "</td>");}
		response.getWriter().append("</tr>" + "</table");
	}	


}
