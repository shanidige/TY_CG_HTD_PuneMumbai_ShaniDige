package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigParamServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		ServletConfig config = getServletConfig();
		String empNameval = config.getInitParameter("empName");
		
		ServletContext context= getServletContext();
		String companyNameval = context.getInitParameter("companyName");

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");

		out.print("<h2>Congif Param Value is -" + empNameval + "<h2>");
		out.print("<h2>Context Param Value is -" + companyNameval + "<h2>");
		out.println("</html>");
		out.println("</body>");

	}// end of doget()
}// end of class
