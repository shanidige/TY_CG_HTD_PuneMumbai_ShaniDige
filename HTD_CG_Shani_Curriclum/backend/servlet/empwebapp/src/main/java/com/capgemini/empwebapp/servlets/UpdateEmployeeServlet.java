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

@WebServlet("/updateEmployee")
public class UpdateEmployeeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session != null) {
			// valid session
			// get the form data
			int empId = Integer.parseInt(req.getParameter("empId"));
			String empName = req.getParameter("empName");
			String password = req.getParameter("Password");
			long mobile =Long.parseLong(( req.getParameter("mobile")));
			String designation = req.getParameter("Designation");
			String gender = req.getParameter("Gender");
			String salary = req.getParameter("salary");
			String age = req.getParameter("age");

			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();

			employeeInfoBean.setEmpId(empId);
			if (empName != null && !empName.isEmpty()) {
				employeeInfoBean.setEmpName(empName);
			}
			if (password != null && !password.isEmpty()) {
				employeeInfoBean.setPassword(password);
			}
			if (mobile != null && !mobile.isEmpty()) {
				employeeInfoBean.setMobile((mobile));
			}
			if (designation != null && !designation.isEmpty()) {
				employeeInfoBean.setDesignation(designation);
			}
			if (gender != null && !gender.isEmpty()) {
				employeeInfoBean.setGender(gender);
			}
			if (salary != null && !salary.isEmpty()) {
				employeeInfoBean.setSalary(Double.parseDouble(salary));
			}
			if (age != null && !age.isEmpty()) {
				employeeInfoBean.setAge(Integer.parseInt(age));
			}

			EmployeeDAO dao = new EmployeeDAOjpaImpl();
			boolean isUpdate = dao.addEmployee(employeeInfoBean);

			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if (isUpdate) {
				out.println("<h2>Employee Record update succesfully....</h2>");
			} else {
				out.println("<h2 style='color: red'> Unable to update Employee Record ...</h2>");
			}
			out.println("</body>");
			out.println("</html>");
		} else {
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
