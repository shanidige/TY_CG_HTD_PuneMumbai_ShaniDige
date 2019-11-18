package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/forward")
public class ForwordServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
//		PrintWriter out =resp.getWriter();
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<h2>hello world</h2>");
//		out.println("</html>");
//		out.println("</body>");
		
		//String url="./currentDate";   //dynamic Resource
		String url ="./searchEmployee.html";
		RequestDispatcher  dispatcher =req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);
	}

}
