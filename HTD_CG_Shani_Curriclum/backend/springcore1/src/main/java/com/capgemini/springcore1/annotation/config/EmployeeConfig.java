package com.capgemini.springcore1.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.capgemini.springcore1.annotation.beans.EmployeeBean;

@Import(DepartmentConfig.class)
@Configuration
public class EmployeeConfig {

	@Bean
	public EmployeeBean getEmployeeBean() {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmpId(101);
		employeeBean.setEmpName("Shani");
		return employeeBean;
	}

}
