package com.capgemini.sorted;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

public class Sorttest extends Student {

	public static void main(String[] argS) {
		ArrayList<Student> al = new ArrayList<Student>();
		Student S1 = new Student(1, "priya", 65.08);
		Student S2 = new Student(5, "riya", 42.3);
		Student S3 = new Student(3, "jiya", 51.6);
		Student S4 = new Student(2, "miya", 88.78);

		al.add(S1);
		al.add(S2);
		al.add(S3);
		al.add(S4);

		Collections.sort(al);

		Iterator<Student> it = al.iterator();

		while (it.hasNext()) {
			Student S = it.next();
			System.out.println("name2 iS" + S.name2);
			System.out.println("id2 iS" + S.id2);
			System.out.println("percentage2 " + S.percentage2);
			System.out.println("-----------");
		}

	}

}
