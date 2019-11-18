package com.capgemini.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore1.beans.EmployeeBean;

public class EmployeeTest {
	public static void main(String[] args) {

		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		EmployeeBean employeeBean =(EmployeeBean) context.getBean("employee1");
		EmployeeBean employeeBean2 =(EmployeeBean) context.getBean("employee2",EmployeeBean.class);
		
		System.out.println("Employee Id : " + employeeBean.getEmpId());
		System.out.println("Employee name: "+ employeeBean.getEmpName());
		System.out.println("Employee Id : " + employeeBean2.getEmpId());
		System.out.println("Employee name: "+ employeeBean2.getEmpName());
	}
}
