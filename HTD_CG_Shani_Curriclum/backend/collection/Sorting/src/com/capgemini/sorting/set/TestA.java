package com.capgemini.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("jkk");
		hs.add("miya");
		hs.add("erty");

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
