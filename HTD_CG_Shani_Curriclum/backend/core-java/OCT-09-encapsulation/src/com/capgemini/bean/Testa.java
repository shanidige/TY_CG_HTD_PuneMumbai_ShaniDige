package com.capgemini.bean;

public class Testa {

	public static void main(String[] args) {
		Student s=new Student();
		s.setId(20);
		s.setName("divya");
		
		
		
  Database d=new Database();
  d.recive(s);
	}

}
