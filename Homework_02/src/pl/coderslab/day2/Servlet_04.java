package pl.coderslab.day2;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_04
 */
@WebServlet("/Servlet_04")
public class Servlet_04 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {
		Cookie[] cookies = request.getCookies();
		String cookieValue = null;
		Cookie cookie = null;
		String resp = "";
		for (Cookie c : cookies) {
			if ("visits".equals(c.getName())) {
				cookie = c;
				}
			}
			if (Objects.isNull(cookie)) {
				resp = "Witaj pierwszy raz na naszej stronie!";
				Cookie visits = new Cookie("visits", "1");
				visits.setMaxAge(31556926);
				response.addCookie(visits);
			} else {
				cookieValue = cookie.getValue();
				resp = "Witaj, odwiedziles nas juz " + cookieValue + " razy!";
				cookie.setValue(cookieValue + "1");
				response.addCookie(cookie);	
		} response.getWriter().append(resp);
	} 
}

