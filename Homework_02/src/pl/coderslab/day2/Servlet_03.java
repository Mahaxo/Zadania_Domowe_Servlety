package pl.coderslab.day2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet_03
 */
@WebServlet("/Servlet_03")
public class Servlet_03 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StringBuilder sb = new StringBuilder();
		HttpSession session = request.getSession();
		sb.append("<body><form action=\"/Homework_02/Servlet_03\" method=\"post\">");
		if (session.isNew()) {
			for (int i = 1; i <= 5; i++) {
				sb.append("<input type=\"text\" name=\"name" + i + "\"> <br>");
			}
		} else {
			String text1 = (String) session.getAttribute("name1");
			String text2 = (String) session.getAttribute("name2");
			String text3 = (String) session.getAttribute("name3");
			String text4 = (String) session.getAttribute("name4");
			String text5 = (String) session.getAttribute("name5");
			sb.append("<input type=\"text\" name=\"name1\" value=\"" + text1 + "\"> <br>");
			sb.append("<input type=\"text\" name=\"name2\" value=\"" + text2 + "\"> <br>");
			sb.append("<input type=\"text\" name=\"name3\" value=\"" + text3 + "\"> <br>");
			sb.append("<input type=\"text\" name=\"name4\" value=\"" + text4 + "\"> <br>");
			sb.append("<input type=\"text\" name=\"name5\" value=\"" + text5 + "\"> <br>");

		}
		sb.append("<input type=\"submit\" value=\"Wyslij\"></form></body>");
		response.getWriter().append(sb.toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String text1 = request.getParameter("name1");
		String text2 = request.getParameter("name2");
		String text3 = request.getParameter("name3");
		String text4 = request.getParameter("name4");
		String text5 = request.getParameter("name5");
		HttpSession session = request.getSession();
		session.setAttribute("name1", text1);
		session.setAttribute("name2", text2);
		session.setAttribute("name3", text3);
		session.setAttribute("name4", text4);
		session.setAttribute("name5", text5);

	}

}
