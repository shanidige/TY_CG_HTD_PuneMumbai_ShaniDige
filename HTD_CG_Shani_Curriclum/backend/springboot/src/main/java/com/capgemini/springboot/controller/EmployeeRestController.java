package com.capgemini.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springboot.beans.EmployeeInfoBean;
import com.capgemini.springboot.beans.EmployeeResponse;
import com.capgemini.springboot.service.EmployeeService;

//@Controller
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmployeeRestController {
	@Autowired
	private EmployeeService service;

	@GetMapping(path = "/getEmployee", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
//	@ResponseBody  as we use rest controller
	public EmployeeInfoBean getEmployees(int empId) {
		EmployeeInfoBean employeeInfoBean = service.getEmployee(empId);
		EmployeeResponse Response = new EmployeeResponse();
		if (employeeInfoBean != null) {
			Response.setStatusCode(210);
			Response.setMessage("succrss");
			Response.setDescription("employee record found");
			Response.setEmployeeInfoBean(employeeInfoBean);
		}
		return employeeInfoBean;

	}// end of getEmployees()

	// before we create EmployeeResponse class

//	@PutMapping(path = "/addEmployee", consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, 																											// json
//			produces = MediaType.APPLICATION_JSON_VALUE) // it will give response in json format ,it can give resp in												// xml as well
////	@ResponseBody  as we use rest controller
//	public boolean addeEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
//		return service.addEmployee(employeeInfoBean);
//	}// end of addeEmployee

	@PutMapping(path = "/addEmployee", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse addeEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isAdded = service.addEmployee(employeeInfoBean);

		EmployeeResponse response = new EmployeeResponse();

		if (isAdded) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("employee Added succesfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription(" employee Added  not succesfully");
		}
		return response;
	}

//	@DeleteMapping(path = "/deleteEmployee", consumes = { MediaType.APPLICATION_JSON_VALUE,
//			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
//					MediaType.APPLICATION_XML_VALUE })
//	public boolean deleteEmployeeForm(int empId) {
//		return service.deleteEmployee(empId);
//
//	}// end of delete

	@DeleteMapping(path = "/deleteEmployee/{employeeId}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse deleteEmployeeForm(@PathVariable("employeeId") int empId) {
		boolean isDeleted = service.deleteEmployee(empId);
		EmployeeResponse response = new EmployeeResponse();

		if (isDeleted) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("employee deleted succesfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription(" employee deleted  not succesfully");
		}

		return response;

	}// end of delete

//	@PostMapping(path = "/updateEmployee", consumes = { MediaType.APPLICATION_JSON_VALUE,
//			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
//					MediaType.APPLICATION_XML_VALUE })
//	public boolean updateEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
//		return service.updateEmployee(employeeInfoBean);
//	}// end of addeEmployee
//	

	@PostMapping(path = "/updateEmployee", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isUpdated = service.updateEmployee(employeeInfoBean);
		EmployeeResponse response = new EmployeeResponse();

		if (isUpdated) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("employee Updated succesfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription(" employee Updated  not succesfully");
		}

		return response;
	}// end

	@GetMapping(path = "/getAll", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse getAllEmployee() {
		List<EmployeeInfoBean> employeeList = service.getAllEmployees();
		EmployeeResponse response = new EmployeeResponse();
		
		if (employeeList != null && !employeeList.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("employee record found");
			response.setEmployeeList(employeeList);
		} else {

			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription(" employee  not found  succesfully");

		}
		return response;

	}// end of addeEmployee

}// end of EmployeeRestController
