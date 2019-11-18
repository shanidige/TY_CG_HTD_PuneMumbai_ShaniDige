package com.capgemini.sorting.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Employeelinkedhas {

	public static void main(String[] args) {
		LinkedHashSet<Emp> hs = new LinkedHashSet<Emp>();

		Emp e1 = new Emp(1, "miya", 4500.9);
		Emp e2 = new Emp(2, "jiya", 49900.9);
		Emp e3 = new Emp(3, "kiya", 233300.9);
		Emp e4 = new Emp(4, "liya", 78800.9);
		Emp e5 = new Emp(5, "niya", 8800.9);

		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);

		for (Object r : hs) {
			System.out.println(r);
		}

		Iterator<Emp> it = hs.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}

	}

}
