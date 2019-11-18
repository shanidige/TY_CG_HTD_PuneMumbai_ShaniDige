package com.capgemini.sorting.set;

import java.util.TreeSet;
import java.util.Iterator;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Worker> ts = new TreeSet<Worker>();

		Worker e1 = new Worker(1, "miya", 4500.9);
		Worker e2 = new Worker(2, "jiya", 49900.9);
		Worker e3 = new Worker(3, "kiya", 233300.9);
		Worker e4 = new Worker(4, "liya", 78800.9);
		Worker e5 = new Worker(2, "jiya", 49900.9);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);

		Iterator<Worker> it = ts.iterator();
		while (it.hasNext()) {
			Worker r = it.next();
			System.out.println("id is" + r.id);
			System.out.println("name is" + r.name);
			System.out.println("salary is" + r.salary);
			System.out.println("-------");
		}
	}

}
