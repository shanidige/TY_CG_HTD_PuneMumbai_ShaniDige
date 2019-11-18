package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet {
	public DateServlet() {
		System.out.println(" Its instantiation phase!!");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Init phase......");
	}// end of init()

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("It's service phase");
		Date date = new Date();

		ServletContext context = req.getServletContext();
		String companyNameval = context.getInitParameter("companyName");

//	  resp.setHeader("refresh","1");
		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();
		out.println("<html>");
//		out.println("<head>");
//		out.println("<meta http-equiv='refresh' content='1'>"); // we can use resp.setHeader as above
//		out.println("</head>");
		out.println("<body>");
		out.println("<h1> Current System Date & Time-<br>");

		out.println(date + "</h1>");
		out.print("<h2>Context Param Value is -" + companyNameval + "<h2>");

		out.println("</body>");
		out.println("</html>");
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println(" It's Destroy.....");
	}

}
