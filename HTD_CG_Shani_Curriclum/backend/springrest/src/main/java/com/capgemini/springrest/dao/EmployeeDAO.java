package com.capgemini.springrest.dao;

import java.util.List;

import com.capgemini.springrest.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	
	public EmployeeInfoBean getEmployee(int empId);
	public EmployeeInfoBean authenticate(int empId, String password );
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean );
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean);
	public boolean deleteEmployee(int empId);
	public List<EmployeeInfoBean> getAllEmployees();
	
	
}//end of DAO
