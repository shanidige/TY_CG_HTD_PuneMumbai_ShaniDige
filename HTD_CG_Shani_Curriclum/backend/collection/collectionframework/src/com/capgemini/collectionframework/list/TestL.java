package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestL {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add("raju");
		li.add(19);
		li.add('m');
		li.add(6.14);

		System.out.println("for loop");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		System.out.println("for each");
		for (Object r : li) {
			System.out.println(r);
		}

		System.out.println("iterator");

		Iterator lit1 = li.iterator();
		while (lit1.hasNext()) {
			Object r = lit1.next();
			System.out.println(r);
		}

		
	}

}
