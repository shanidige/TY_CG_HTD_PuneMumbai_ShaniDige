package com.capgeminis.string.sortusinglamba;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priorityqueueinteger {
	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		p.add(10);
		p.add(3);
		p.add(11);
		p.add(51);

		Iterator<Integer> it = p.iterator();
		while (it.hasNext()) {
			Integer r = it.next();
			System.out.println(r);
		}
	}
}
