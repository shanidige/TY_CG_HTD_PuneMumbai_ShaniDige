package com.capgemini.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.springmvc.beans.EmployeeInfoBean;
import com.capgemini.springmvc.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/empLoginForm")
	public String displayEmpLoginForm() {
		return "empLoginForm";

	}// end of displayEmpLoginForm()

	@PostMapping("/empLogin")
	public String empLogin(int empId, String password, ModelMap modelMap, HttpServletRequest req) {
		EmployeeInfoBean employeeInfoBean = service.authenticate(empId, password);

		if (employeeInfoBean != null) {
			HttpSession httpSession = req.getSession(true);
			httpSession.setAttribute("emplyoeeInfoBean", employeeInfoBean);

			return "empHomePage";
		} else {
			modelMap.addAttribute("msg", "invalid credential");
			return "empLoginForm";
		}

	} // end of empLogin()

	@GetMapping("/addEmployeeForm")
	public String displayAddEmpForm(HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			modelMap.addAttribute("msg", "please Login first");
			return "empLoginForm";
		} else {
			return "addEmployeeForm";
		}
	}// end of displayAddEmpForm

	@PostMapping("/addEmployee")
	public String addEmpForm(EmployeeInfoBean employeeInfoBean, HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// inavlid session
			modelMap.addAttribute("msg", "please Login first");
			return "empLoginForm";
		} else {
			// valid session
			if (service.addEmployee(employeeInfoBean)) {
				modelMap.addAttribute("msg", "employee added");
			} else {
				modelMap.addAttribute("msg", "unable to add Employee");
			}
		}
		return "addEmployeeForm";
	}// end of addEmpForm

	@PostMapping("/logout")
	public String logout(HttpSession session, ModelMap modelMap) {
		session.invalidate();
		modelMap.addAttribute("msg", "Logout Succesfully");

		return "empLoginForm";

	}// end of logout

	@GetMapping("/updateEmployeeForm")
	public String displayUpdateEmpForm(HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// invalid session
			modelMap.addAttribute("msg", "please Login first");
			return "empLoginForm";
		} else {
			// valid session
			return "updateEmployeeForm";

		}
	}// end of displayUpdateEmpForm

	@PostMapping("/updateEmployeeForm")
	public String updateEmployee(EmployeeInfoBean employeeInfoBean, HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// invalid session
			modelMap.addAttribute("msg", "please Login first");
			return "empLoginForm";
		} else {
			// valid session
			if (service.updateEmployee(employeeInfoBean)) {
				modelMap.addAttribute("msg", "employee Details are updated Sucsessfully!!!11");
			} else {
				modelMap.addAttribute("msg", " unable to updated Sucsessfully!!!11");
			}
		}
		return "updateEmployeeForm";
	}// end of updateEmployee

	@GetMapping("/searchEmployeeForm")
	public String displaySearchEmployeeForm(HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";

		} else {
			// Valid Session
			return "searchEmployeeForm";
		}
	}// End of displaySearchEmployeeForm()

	@GetMapping("/searchEmployee")
	public String searchEmployee(int empId, HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";

		} else {
			EmployeeInfoBean employeeInfoBean = service.getEmployoee(empId);
			if (employeeInfoBean != null) {
				modelMap.addAttribute("employeeInfoBean", employeeInfoBean);
			} else {
				modelMap.addAttribute("msg", "Employee ID " + empId + " Not Found!!!");
			}

			return "searchEmployeeForm";
		}
	}// End of searchEmployee()

	@GetMapping("/deleteEmployeeForm")
	public String displayDeleteEmployeeForm(HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";

		} else {
			// Valid Session
			return "deleteEmployeeForm";
		}
	}// End of displaySearchEmployeeForm()

	@GetMapping("/deleteEmployee")
	public String deleteEmployee(int empId, HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";

		} else {
			// Valid Session
			if (service.deleteEmployee(empId)) {
				modelMap.addAttribute("msg", "Employee Deleted Successfully!");
			} else {
				modelMap.addAttribute("msg", "Employee ID " + empId + " Not Found!");
			}

			return "deleteEmployeeForm";
		}
	}// End of searchEmployee()

	@GetMapping("/seeAllEmployees")
	public String getAllEmployees(HttpSession session, ModelMap modelMap) {

		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";

		} else {
			// Valid Session
			List<EmployeeInfoBean> employeesList = service.getAllEmployees();
			modelMap.addAttribute("employeesList", employeesList);

			return "displayAllEmployees";
		}
	}// End of getAllEmployees()

	@GetMapping("/home")
	public String displayEmpHomePage(HttpSession session, ModelMap modelMap) {

		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";

		} else {
			// Valid Session
			return "empHomePage";
		}
	}// End of displayEmpHomePage()

}