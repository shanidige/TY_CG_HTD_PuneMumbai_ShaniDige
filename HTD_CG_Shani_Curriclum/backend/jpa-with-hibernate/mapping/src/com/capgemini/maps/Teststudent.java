package com.capgemini.maps;

import java.util.ArrayList;
import java.util.Iterator;


public class Teststudent {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "ambika", 34.6,'f');
		Student s2 = new Student(2, "bika", 76.5,'m');
		Student s3 = new Student(3, "ika", 28.3,'f');
		Student s4 = new Student(4, "aka", 87.6,'f');
		Student s5 = new Student(5, "moka", 22.3,'m');
		Student s6 = new Student(6, "ambaa",98.5,'f');
		Student s7 = new Student(7, "ambjoa",62.3,'m');
		Student s8 = new Student(8, "amoyiika", 72.3,'f');
		

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		al.add(s7);
		al.add(s8);
		

		Test t =new Test();
		
		  t.displayall(al); 
		  t.displayFailed(al); 
		  t.displayfailedmale(al);
		  t.displayfailedfemale(al); 
		  t.displayall(al);
		  t.displayPassedmale(al);
		  t.displayPassedfemale(al); 
		  t.displayTopper(al);
	}

}
