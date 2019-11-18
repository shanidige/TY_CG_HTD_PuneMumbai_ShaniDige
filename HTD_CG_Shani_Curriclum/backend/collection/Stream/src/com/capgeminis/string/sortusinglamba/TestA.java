package com.capgeminis.string.sortusinglamba;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


public class TestA {

	public static void main(String[] args) {
		Comparator<Employee> comp=(e1,e2) -> {
			if(e1.height> e2.height) 
			{
				return 1;
			}
			else if (e1.height < e2.height) 
			{
				return -1;
			}else
			{
				return 0;
			}
		};
		
		
		TreeSet<Employee> ts=new TreeSet<Employee>(comp);
		
		Employee e1 = new Employee(1, "miya", 5.7);
		Employee e2 = new Employee(2, "jiya", 6.6);
		Employee e3 = new Employee(3, "kiya", 4.5);
		Employee e4 = new Employee(4, "liya", 7.9);
		Employee e5 = new Employee(2, "jiya", 4.9);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
		
		Iterator<Employee> it = ts.iterator();
		while (it.hasNext()) {
			Employee r = it.next();
			System.out.println("id is" + r.id);
			System.out.println("name is" + r.name);
			System.out.println("height is" + r.height);
			System.out.println("-------");
		}
		
		
	}

}
