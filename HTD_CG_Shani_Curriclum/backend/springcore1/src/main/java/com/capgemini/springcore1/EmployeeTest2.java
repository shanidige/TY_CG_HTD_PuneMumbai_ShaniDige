package com.capgemini.springcore1;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore1.beans.EmployeeBean;

public class EmployeeTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig.xml");

//employee1
		EmployeeBean emp1 = context.getBean("employee", EmployeeBean.class);

		System.out.println("enter employee Id :");
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.println("entet the name :");
		String name = sc.nextLine();
		emp1.setEmpId(empId);
		emp1.setEmpName(name);

		System.out.println("Employee-1 Id : " + emp1.getEmpId());
		System.out.println("Employee-1 name: " + emp1.getEmpName());
		
//employee2
		EmployeeBean emp2 = context.getBean("employee", EmployeeBean.class);

		System.out.println("enter employee Id :");
		int empId2 = sc.nextInt();
		sc.nextLine();
		System.out.println("entet the name :");
		String name2 = sc.nextLine();
		emp2.setEmpId(empId2);
		emp2.setEmpName(name2);

		System.out.println("Employee-1 Id : " + emp1.getEmpId());
		System.out.println("Employee-1 name: " + emp1.getEmpName());
		System.out.println("Employee-2 Id : " + emp2.getEmpId());
		System.out.println("Employee-2 name: " + emp2.getEmpName());

	}

}
