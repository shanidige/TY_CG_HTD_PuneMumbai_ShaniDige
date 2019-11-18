package com.capgemini.maps;

import java.util.TreeMap;
import java.util.Map;

public class TestCtreemap {

	public static void main(String[] args) {
		
			TreeMap<String, Integer>tm = new TreeMap<String, Integer>();
			tm.put("ondu", 1);
			tm.put("idhu", 5);
			tm.put("hartu", 10);
			tm.put("eredu", 2);

			for (Map.Entry<String, Integer> r :tm.entrySet()) {
				String k = r.getKey();
				Integer v = r.getValue();
				System.out.println("key is" + k);
				System.out.println("value is " + v);
				System.out.println("------------------------");
		}
	}

}
