package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empIdval = req.getParameter("empId");

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		out.print("<html>");
		out.print("<body>");
		out.print("<h1> Emplpyee Id :" + empIdval + "found-</h1>");
		out.print("<h3>Emp name:=sam<br>");
		out.print("salary: 4 lpa");
		out.print("address: MUM ");
		out.print("designation : devloper <h/h3>");
		out.print("</body>");
		out.print("</html>");
	}

}
