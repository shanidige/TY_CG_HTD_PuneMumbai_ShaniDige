package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.Vector;

public class TestN {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("raju");
		v.add(19);
		v.add('m');
		v.add(6.14);

		for (int i = 0; i < 4; i++) {
			System.out.println(i);
		}

		for (Object r : v) {
			System.out.println(r);
		}

		Iterator it = v.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}

	}

}
