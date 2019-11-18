package com.capgeminis.string.list;

import java.util.ArrayList;
import java.util.Comparator;

public class TestGminmax {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(59);
		al.add(54);
		al.add(15);

		Comparator<Integer> comp = (i, j) -> i.compareTo(j);

		Integer small = al.stream().min(comp).get();
		System.out.println(small);

		Integer large = al.stream().max(comp).get();
		System.out.println(large);
	}
}
