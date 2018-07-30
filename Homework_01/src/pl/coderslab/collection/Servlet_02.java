package pl.coderslab.collection;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_02
 */
@WebServlet("/Servlet_02")
public class Servlet_02 extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		File file = new File ("/home/max/workspace/WRO_JEE_W_02_Servlety/src/b_Zadania_Domowe/a_Dzien_1/oop.txt");
		Scanner scan = new Scanner (file);
		while (scan.hasNextLine()) {
			response.getWriter().append("<h2>" + scan.nextLine() + "</h2>");
		}
	}

	

}
