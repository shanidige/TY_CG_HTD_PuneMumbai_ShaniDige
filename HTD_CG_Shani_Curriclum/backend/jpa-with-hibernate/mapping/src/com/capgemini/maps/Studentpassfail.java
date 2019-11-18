package com.capgemini.maps;

import java.util.function.Predicate;

public class Studentpassfail {

	public static void main(String[] args) {
		
		Predicate<Student> p = i-> {
			if (i.percentage >  35.00) {
				return true;
			} else {
				return false;
			}
			

		};
		Student s1 = new Student(1, "ambika", 34.6,'f');
		boolean res=p.test(s1);
		System.out.println("result is "+ res);
		
	}

}
