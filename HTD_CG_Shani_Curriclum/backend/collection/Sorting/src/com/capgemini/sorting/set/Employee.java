package com.capgemini.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class Employee {

	public static void main(String[] args) {
		HashSet<Emp> hs = new HashSet<Emp>();

		Emp e1 = new Emp(1, "miya", 4500.9);
		Emp e2 = new Emp(2, "jiya", 49900.9);
		Emp e3 = new Emp(3, "kiya", 233300.9);
		Emp e4 = new Emp(4, "liya", 78800.9);
		Emp e5 = new Emp(2, "jiya", 49900.9);

		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);

		Iterator<Emp> it = hs.iterator();
		while (it.hasNext()) {
			Emp r = it.next();
			System.out.println("id is" + r.id);
			System.out.println("name is" + r.name);
			System.out.println("salary is" + r.salary);
			System.out.println("-------");
		}

	}

}
