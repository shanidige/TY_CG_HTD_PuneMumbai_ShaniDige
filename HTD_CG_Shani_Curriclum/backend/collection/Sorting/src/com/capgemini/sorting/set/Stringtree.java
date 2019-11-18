package com.capgemini.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Stringtree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("sha");
		ts.add("gf");
		ts.add("bf");
		ts.add("gh");
		ts.add("hjj");

		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			String r = it.next();
			System.out.println(r);
	}

}
}