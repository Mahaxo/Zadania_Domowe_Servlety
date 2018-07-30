package pl.coderslab.day2;

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
 * Servlet implementation class Servlet_05_1
 */
@WebServlet("/Servlet_05_1")
public class Servlet_05_1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuilder sb = new StringBuilder();
		sb.append("<body><form action=\"/Homework_02/Servlet_05_1\" method=\"post\">").
		append("Nazwa produktu <input type=\"text\" name=\"nazwa\"> <br>").
		append("Ilosc <input type=\"number\" name=\"ilosc\"> <br>").
		append("Cena <input type=\"number\" name=\"cena\" min=\"0\" step=\"0.01\" <br>").
		append("<input type=\"submit\" value=\"Wyslij\"></form></body>").
		append("<a href=http://localhost:8080/Homework_02/Servlet_05_2>Zawartosc koszyka</a>");
		response.getWriter().append(sb.toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuilder sb = new StringBuilder();
		String name = request.getParameter("nazwa");
		String quantity = request.getParameter("ilosc");
		String price = request.getParameter("cena");
		HttpSession session = request.getSession();
		if (session.isNew()) {
		List <String> products = new ArrayList<>();
		products.add(name);
		products.add(quantity);
		products.add(price);
		session.setAttribute("basket", products);
	} else {
		List <String> products = (List<String>) session.getAttribute("basket");
		products.add(name);
		products.add(quantity);
		products.add(price);
		session.setAttribute("basket", products);
	}	sb.append("Produkt dodany!"); 
		response.getWriter().append(sb.toString());
		response.sendRedirect("/Homework_02/Servlet_05_1");
	
	}

}
