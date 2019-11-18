package com.capgemini.bean;

public class Database {
	void recive(Student t) {
System.out.println("************  i am a database***********");
System.out.println("name is"+t.getName());
System.out.println("id is"+t.getId());

}
	
	
	void  recive(Employee e) {
		System.out.println("************  i am a database***********");
		System.out.println("name is"+e.getName());
		System.out.println("id is"+e.getId());
		System.out.println("salary is"+e.getSalary());
		System.out.println("salary is"+e.getRole());
		System.out.println("salary is"+e.getDept());
		
	}
}
