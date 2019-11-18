package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(24);
		al.add("chinnu");
		al.add(2.99);
		al.add('f');

//here we use object next as well as boolean hasNext method to overcome  java.util.NoSuchElementException//

		Iterator it = al.iterator();

		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}

		/*
		 * Object p=it.next(); System.out.println(p);
		 * 
		 * 
		 * java.util.NoSuchElementException
		 */

	}

}
