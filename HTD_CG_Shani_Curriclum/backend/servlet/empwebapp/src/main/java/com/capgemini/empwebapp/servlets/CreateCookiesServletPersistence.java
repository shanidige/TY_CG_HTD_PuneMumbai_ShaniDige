package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/persistencecreatecookie")
public class CreateCookiesServletPersistence extends HttpServlet {

	//persistence cookies = once you logout  from browser cookies will still present   

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie = new Cookie("empId", "123");
		cookie.setMaxAge(7 * 24 * 60 * 60);
		resp.addCookie(cookie);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>cookie created succesfully !!!!!!</h2>");
		out.println("</html>");
		out.println("</body>");

	}//end of doGet
}//end of class
