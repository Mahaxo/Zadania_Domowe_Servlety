package pl.coderslab.day2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

/**
 * Servlet implementation class Servlet_02
 */
@WebServlet("/Servlet_02")
public class Servlet_02 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String binary = request.getParameter("binary");
			int decimal = 0;
			for (int i=0; i<binary.length(); i++) {
				if (Character.getNumericValue(binary.charAt(i)) == 0 || Character.getNumericValue(binary.charAt(i)) == 1) {
					System.out.println("Super, to jest binarna liczba!");
					decimal = Integer.parseInt(binary,2);
				} else {
					System.out.println("To nie jest binarna liczba, powtorz!");
				} 
				} 		response.getWriter().append(binary + " to liczba " + decimal);
		//	} String[] binaries = binary.split("");
		//	double result = 0; 
		//	double p = 0; 
		//	for (int i = binaries.length-1; i>=0; i--) {
		//		result += Math.pow(Double.parseDouble(binaries[i]),p);
		//		p++;
		//	}
		//	response.getWriter().append(binary + " to liczba " + result);
	
	}
}
