package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.empwebapp.beans.EmployeeInfoBean;
import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOjpaImpl;

@WebServlet("/searchEmployee")
public class SearchEmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String empIdval = req.getParameter("empId");
		int empId = Integer.parseInt(empIdval);

		EmployeeDAO dao = new EmployeeDAOjpaImpl();
		EmployeeInfoBean employeeInfoBean = dao.getEmployee(empId);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<body>");

		if (employeeInfoBean != null) {
			out.println("<h2 Employee ID" + empId + "found-</h2>");
			out.println("Employee Name =" + employeeInfoBean.getEmpName());
			out.println("<br>age =" + employeeInfoBean.getAge());
			out.println("<br>mobile =" + employeeInfoBean.getMobile());
			out.println("<br>gender =" + employeeInfoBean.getGender());
			out.println("<br>salary =" + employeeInfoBean.getSalary());
			out.println("<br>designation =" + employeeInfoBean.getDesignation());
			out.println("<br>password =" + employeeInfoBean.getPassword());
		} else {
			out.println("<h3 style='color : red'> Employee ID" + empId + " Not Found!!");
		}
		out.println("</html>");
		out.println("</body>");

	}
}