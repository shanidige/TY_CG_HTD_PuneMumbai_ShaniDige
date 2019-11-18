package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Mypractice {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("raju");
		al.add(19);
		al.add('m');
		al.add(6.14);

		for (int i = 0; i < 4; i++) {
			Object r = al.get(i);
			System.out.println(r);
		}

		System.out.println("--------------");
		for (Object r : al) {
			System.out.println(r);
		}

		System.out.println("-------");
		ListIterator lit = al.listIterator();

		while (lit.hasNext()) {
			Object st = lit.next();
			System.out.println(st);
		}

		System.out.println("---------");

		while (lit.hasPrevious()) {
			Object st = lit.previous();
			System.out.println(st);
		}

	}
}
