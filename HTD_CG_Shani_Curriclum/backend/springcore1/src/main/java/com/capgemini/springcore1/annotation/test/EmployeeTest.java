package com.capgemini.springcore1.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.capgemini.springcore1.annotation.beans.EmployeeBean;
import com.capgemini.springcore1.annotation.config.DepartmentConfig;
import com.capgemini.springcore1.annotation.config.EmployeeConfig;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		System.out.println(" Employee Id : " + employeeBean.getEmpId());
		System.out.println("Employee Name :" + employeeBean.getEmpName());
		System.out.println("............Department Info...........");
		System.out.println(" deptId : "+ employeeBean.getDeptBean().getDeptId());
		System.out.println(" deptName :"+employeeBean.getDeptBean().getDeptName());
//		((AbstractApplicationContext).context).registerShutdownHook(;)
		
		((AbstractApplicationContext)context).close();
	}

}
