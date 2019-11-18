package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.empwebapp.beans.EmployeeInfoBean;
import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOjpaImpl;

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		if (session != null) {
			// valid session
			// get the form data
			int empId = Integer.parseInt(req.getParameter("empId"));
			String empName = req.getParameter("empName");
			String password = req.getParameter("Password");
			long mobile = Long.parseLong(req.getParameter("mobile"));
			String designation = req.getParameter("Designation");
			String gender = req.getParameter("Gender");
			double salary = Double.parseDouble(req.getParameter("salary"));
			int age = Integer.parseInt(req.getParameter("age"));

			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empId);
			employeeInfoBean.setEmpName(empName);
			employeeInfoBean.setPassword(password);
			employeeInfoBean.setMobile(mobile);
			employeeInfoBean.setDesignation(designation);
			employeeInfoBean.setGender(gender);
			employeeInfoBean.setSalary(salary);
			employeeInfoBean.setAge(age);

			EmployeeDAO dao = new EmployeeDAOjpaImpl();
			boolean isAdded = dao.addEmployee(employeeInfoBean);

			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if (isAdded) {
				out.println("<h2>Employee Record added succesfully....</h2>");
			} else {
				out.println("<h2 style='color: red'> Unable to add Employee Recordsuccesfully....</h2>");
			}
			out.println("</body>");
			out.println("</html>");
		}

		else {
			// Invalid session
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h2 style='color: red'>please login first</h2>");
			out.println("</body>");
			out.println("</html>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("./loginForm.html");
			dispatcher.include(req, resp);
		}
	}
}
