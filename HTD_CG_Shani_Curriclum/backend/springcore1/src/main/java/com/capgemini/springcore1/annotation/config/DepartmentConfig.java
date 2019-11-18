package com.capgemini.springcore1.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.springcore1.annotation.beans.DepartmentBean;

@Configuration
public class DepartmentConfig {

	//	@Primary
	@Bean(name="Dev")
	 public DepartmentBean  getDevDept()
	{
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(901);
		bean.setDeptName("Dev");
		return bean;

	}

	@Bean(name="Test")
	public DepartmentBean getTestDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(301);
		bean.setDeptName("Test");
		return bean;

	}

	@Bean(name="full stack")
	public DepartmentBean getFullstackDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(401);
		bean.setDeptName("full stack");
		return bean;

	}
	
}
