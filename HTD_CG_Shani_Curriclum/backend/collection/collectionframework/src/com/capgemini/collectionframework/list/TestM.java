package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String>li = new LinkedList<String>();
		li.add("raju");
		li.add("1gggg9");
		li.add("jjjjm");
		li.add("6.14hhhh");

		System.out.println("for loop");
		for (int i = 0 ; i<4 ; i++) {
		System.out.println(i);
		}

		System.out.println("for each");
		for (String r : li) {
			System.out.println(r);
		}

		System.out.println("iterator");

		Iterator<String> lit1 = li.iterator();
		while (lit1.hasNext()) {
			Object r = lit1.next();
			System.out.println(r);
		}
	}
}
