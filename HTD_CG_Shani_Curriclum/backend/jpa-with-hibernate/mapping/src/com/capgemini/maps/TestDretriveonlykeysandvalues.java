package com.capgemini.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestDretriveonlykeysandvalues {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		lhm.put("ondu", 1);
		lhm.put("idhu", 5);
		lhm.put("hartu", 10);
		lhm.put("eredu", 2);

		System.out.println("*************key***********");
		Set<String> s = lhm.keySet();
		for (String r : s) {
			System.out.println(r);
		}

		System.out.println("************values****");
		Collection<Integer> col = lhm.values();
		for (Integer r : col) {
			System.out.println(r);
		}

	}

}
