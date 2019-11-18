package com.capgemini.vidyathri;

import java.util.ArrayList;
import java.util.Iterator;

public class Driver {

	void display(ArrayList<Student> k) {
		for (Student s : k) {
			System.out.println("is is " + s.id2);
			System.out.println("name is " + s.name2);
			System.out.println("percentage is " + s.percentage2);
		}
	}

	void onlypass(ArrayList<Student> k) {
		Iterator<Student> it = k.listIterator();

		while (it.hasNext()) {
			Student s = it.next();
			if (s.percentage2 > 35) {
				System.out.println("is is " + s.id2);
				System.out.println("name is " + s.name2);
				System.out.println("percentage is " + s.percentage2);
				System.out.println("-----------------");
			}

		}
	}
}
