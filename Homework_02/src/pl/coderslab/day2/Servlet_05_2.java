package pl.coderslab.day2;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet_05_2
 */
@WebServlet("/Servlet_05_2")
public class Servlet_05_2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuilder sb = new StringBuilder();
		HttpSession session = request.getSession();
		List <String> products = (List<String>) session.getAttribute("basket");
		for (String product: products) {
			System.out.println(product);
		}
		double sum = 0;
		for (int i = 0; i<products.size()-1;i=i+3) {
			sb.append(products.get(i) + " - " + Integer.parseInt(products.get(i+1)) + " x " + Double.parseDouble(products.get(i+2)) + " zl = " + (Integer.parseInt(products.get(i+1))*Double.parseDouble(products.get(i+2)) + " zl \n"));
			sum+=Integer.parseInt(products.get(i+1))*Double.parseDouble(products.get(i+2));
		} response.getWriter().append(sb.toString()).append("SUMA: " + sum);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
