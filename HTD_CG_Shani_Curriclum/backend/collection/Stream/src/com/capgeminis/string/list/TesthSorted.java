package com.capgeminis.string.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TesthSorted {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(59);
		al.add(54);
		al.add(15);

		List<Integer> x = al.stream().sorted().collect(Collectors.toList());

		System.out.println(x);

	}

}
