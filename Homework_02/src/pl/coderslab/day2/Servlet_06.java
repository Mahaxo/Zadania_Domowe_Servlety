package pl.coderslab.day2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_06
 */
@WebServlet("/Servlet_06")
public class Servlet_06 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] numbers = request.getParameterValues("num");
		StringBuilder sb = new StringBuilder();
		String poczatek = "Liczby: \n";
		String srednia2 = "Srednia: \n";
		String suma2 = "Suma: \n";
		String iloczyn2 = "Iloczyn: \n";
		double srednia = 0.00;
		double suma = 0.00;
		double iloczyn = 1.00;
		for (String number: numbers) {
			sb.append("- " + number + "\n");
			suma+=Double.parseDouble(number);
			srednia=suma/numbers.length;
			iloczyn*=Double.parseDouble(number);
		}
		response.getWriter().append(poczatek).append(sb.toString()).append(srednia2 + "- " + srednia + "\n").append(suma2 + "- " + suma + "\n").append(iloczyn2 + "- " + iloczyn);
	}

}
