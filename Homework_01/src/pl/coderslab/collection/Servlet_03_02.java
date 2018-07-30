package pl.coderslab.collection;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_03_02
 */
@WebServlet("/Servlet_03_02")
public class Servlet_03_02 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] params = request.getParameterValues("id");
		String products[] = {
		        "Asus Transformr;2999.99",
		        "iPhone 6';3499.18",
		        "Converse Sneakers;125.00",
		        "LG OLED55B6P OLED TV;6493.91",
		        "Samsung HT-J4100;800.99",
		        "Alpine Swiss Dress Belt;99.08",
		        "60 Watt LED;1.50",
		        "Arduino Nano;3.26",
		    };
		for (int i = 0; i<params.length; i++) {
			for (int j = 0; j<products.length; j++) {
				if (Integer.parseInt(params[i]) == j) {
					response.getWriter().append("<h2>" + products[j] +"</h2>");
				} else {
					response.getWriter().append("<h2>" + "Product not found" + "</h2>");
				}
			}
		}
	}


}
