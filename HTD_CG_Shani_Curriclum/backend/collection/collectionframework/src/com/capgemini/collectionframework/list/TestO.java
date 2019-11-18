package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public abstract class TestO {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();

		Student s1 = new Student(1, "priya", 56.08);
		Student s2 = new Student(2, "riya", 86.78);
		Student s3 = new Student(3, "jiya", 76.78);
		Student s4 = new Student(4, "miya", 86.78);
		Student s5 = new Student(5, "piya", 569.78);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		for (int i = 0; i < 5; i++) {
			Student s = al.get(i);
			System.out.println("name is" + s.name);
			System.out.println("id id" + s.id);
			System.out.println("percentage " + s.percentage);
		}
		System.out.println("----------------------");
		for (Object r : al) {
			System.out.println(r);
		}

		System.out.println("--------------------");

		ListIterator<Student> it = al.listIterator();
		System.out.println("forwrd>>>>>>>");
		while (it.hasNext()) {
			Student r = it.next();
			System.out.println(r);
		}

		System.out.println("<<<<<backword");
		while (it.hasPrevious()) {
			Student r = it.previous();
			System.out.println(r);
		}

	}

}
