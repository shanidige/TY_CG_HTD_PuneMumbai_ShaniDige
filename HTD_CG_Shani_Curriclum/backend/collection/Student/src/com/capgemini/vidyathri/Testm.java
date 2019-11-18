package com.capgemini.vidyathri;

import java.util.ArrayList;

public class Testm {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();

		Student s1 = new Student(1, "priya", 56.08);
		Student s2 = new Student(2, "riya", 34.78);
		Student s3 = new Student(3, "jiya", 78.78);
		Student s4 = new Student(4, "miya", 86.78);
		Student s5 = new Student(5, "piya", 56.78);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		Driver d = new Driver();
		d.display(al);
		System.out.println("************");
		d.onlypass(al);
	}

}
