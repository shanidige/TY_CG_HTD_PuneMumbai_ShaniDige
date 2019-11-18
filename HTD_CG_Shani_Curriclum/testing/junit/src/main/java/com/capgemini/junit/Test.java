package com.capgemini.junit;

public class Test {
public static void main(String[] args) {
	Student s = new Student("om",56.78,'m');
	Student s2 = new Student("ram",56.78,'m');
	
	School sc= new School();
	
//	sc.registerStudent(null);
	
	
	Student regStu = sc.registerStudent(s);
	Student regStu2 = sc.registerStudent(s2);
	
	
	System.out.println(" Id is "+regStu.getId());
	System.out.println(" name is "+regStu.getName());
	
	System.out.println("****************");
	
	
	System.out.println(" Id is "+regStu2.getId());
	System.out.println(" name is "+regStu2.getName());
}
}
