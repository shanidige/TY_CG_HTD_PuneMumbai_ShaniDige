package com.capgemini.empwebapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/redirect")

public class RedirectServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
//	String url = "http://www.naukri.com"; 		redireccting to external resource
	String url = "./currentDate";          //	redireccting to internal resource
	
	resp.sendRedirect(url);
	
	
}//end of doget();
}//end of class
