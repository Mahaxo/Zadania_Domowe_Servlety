package pl.coderslab.day2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_01
 */
@WebServlet("/Servlet_01")
public class Servlet_01 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int value = Integer.parseInt(request.getParameter("currency"));
		String currency = request.getParameter("money");
		StringBuilder sb = new StringBuilder();
		if (currency.equals("eurToUsd")) {
			double result = value*1.17;
			sb.append(value + " euro to " + result + " USD!");
		} else if (currency.equals("usdToEur")) { 
			double result = value*0.85;
			sb.append(value + " USD to " + result + " Euro!");
		} else if (currency.equals("eurToPln")) { 
			double result = value*4.32;
			sb.append(value + " Euro to " + result + " PLN!");
		} else if (currency.equals("plnToEur")) { 
			double result = value*0.23;
			sb.append(value + " PLN to " + result + " Euro!");
		} else if (currency.equals("usdToPln")) { 
			double result = value*3.68;
			sb.append(value + " USD to " + result + " PLN!");
		} else { 
			double result = value*0.27;
			sb.append(value + " PLN to " + result + " USD!");
			}
		response.getWriter().append(sb.toString());
	} 
}

	