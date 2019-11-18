package com.capgemini.collectionframework.list;

import java.util.Vector;
import java.util.Iterator;

public class TestQ {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("priya");
		v.add("ziya");
		v.add("miya");

		for (int i = 0; i < 3; i++) {
			Object r = v.get(i);
			System.out.println(r);
		}

		System.out.println("-----------");

		for (String s : v) {
			System.out.println(s);
		}
		System.out.println("-----------");

		Iterator<String> it = v.iterator();

		while (it.hasNext()) {
			String st = it.next();
			System.out.println(st);
		}

	}
}