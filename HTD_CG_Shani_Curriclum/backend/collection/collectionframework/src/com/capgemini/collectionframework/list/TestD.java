package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(24);
		al.add("chinnu");
		al.add(2.99);
		al.add('f');

		ListIterator m = al.listIterator();
		System.out.println("forword.....>>.");

		while (m.hasNext()) {Object r = m.next();
			System.out.println(r);
		}

		System.out.println("<<<<<<<<.....backwrd");
		while (m.hasPrevious()) {
			Object r = m.previous();
			System.out.println(r);
		}

	}

}
