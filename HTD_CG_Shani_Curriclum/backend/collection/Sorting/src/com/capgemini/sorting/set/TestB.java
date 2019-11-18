package com.capgemini.sorting.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("15");
		hs.add("a67");
		hs.add("456");

		for (String r : hs) {
			System.out.println(r);
		}
		
		
		System.out.println("-----------------");
		
		
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}


	}

}
