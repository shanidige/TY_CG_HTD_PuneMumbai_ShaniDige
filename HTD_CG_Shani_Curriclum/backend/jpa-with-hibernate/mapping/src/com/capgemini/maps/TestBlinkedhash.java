package com.capgemini.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestBlinkedhash {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		lhm.put("ondu", 1);
		lhm.put("idhu", 5);
		lhm.put("hartu", 10);
		lhm.put("eredu", 2);

		for (Map.Entry<String, Integer> r : lhm.entrySet()) {
			String k = r.getKey();
			Integer v = r.getValue();
			System.out.println("key is" + k);
			System.out.println("value is " + v);
			System.out.println("------------------------");

		}
	}
}
