package com.capgemini.maps;

import java.util.function.Predicate;

public class Testpredicate {
	public static void main(String[] args) {

		Predicate<Integer> p = i -> {
			if (i % 2 == 0) {
				return false;
			} else {
				return true;
			}

		};

		boolean res = p.test(15);
		System.out.println("result is " + res);
	}
}
