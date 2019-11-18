package com.capgemini.maps;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Collector;
public class Test {

	public void displayall(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("name is  " + s.name);
			System.out.println("id is  " + s.id);
			System.out.println("percentage is  " + s.percentage);
			System.out.println("gen is " + s.gen);
System.out.println("1111111111111111111111111111111111111111111111");
		}
	}

	void displayFailed(ArrayList<Student> al) {
		List<Student> li = al.stream().filter(i -> i.percentage < 35).collect(Collectors.toList());
		Iterator<Student> it = li.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("name is  " + s.name);
			System.out.println("id is  " + s.id);
			System.out.println("percentage is  " + s.percentage);
			System.out.println("gen is " + s.gen);
			System.out.println("@@@@@@2@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2");
		}
	}

	void displayfailedmale(ArrayList<Student> al) {
		List<Student> li = al.stream().filter(i -> i.percentage > 35 && i.gen == 'm').collect(Collectors.toList());
		Iterator<Student> it = li.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("name is  " + s.name);
			System.out.println("id is  " + s.id);
			System.out.println("percentage is  " + s.percentage);
			System.out.println("gen is " + s.gen);
			System.out.println("************************");
		}
	}

	void displayfailedfemale(ArrayList<Student> al) {
		List<Student> li = al.stream().filter(i -> i.percentage > 35 && i.gen == 'f').collect(Collectors.toList());
		Iterator<Student> it = li.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("name is  " + s.name);
			System.out.println("id is  " + s.id);
			System.out.println("percentage is  " + s.percentage);
			System.out.println("gen is " + s.gen);
			System.out.println("777777777777777777777");
		}
	}

	void displayPassed(ArrayList<Student> al) {
		List<Student> li = al.stream().filter(i -> i.percentage > 35).collect(Collectors.toList());
		Iterator<Student> it = li.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("name is  " + s.name);
			System.out.println("id is  " + s.id);
			System.out.println("percentage is  " + s.percentage);
			System.out.println("gen is " + s.gen);
			System.out.println("888888888888888888888888888");
		}
	}

	void displayPassedmale(ArrayList<Student> al) {
		List<Student> li = al.stream().filter(i -> i.percentage > 35 && i.gen =='m').collect(Collectors.toList());
		Iterator<Student> it = li.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("name is  " + s.name);
			System.out.println("id is  " + s.id);
			System.out.println("percentage is  " + s.percentage);
			System.out.println("gen is " + s.gen);
			System.out.println("000000000000000000000000000");
		}
	}

	void displayPassedfemale(ArrayList<Student> al) {
		List<Student> li = al.stream().filter(i -> i.percentage > 35 && i.gen == 'f').collect(Collectors.toList());
		Iterator<Student> it = li.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("name is  " + s.name);
			System.out.println("id is  " + s.id);
			System.out.println("percentage is  " + s.percentage);
			System.out.println("gen is " + s.gen);
			System.out.println("-------------------------------");
		}
	}
	
	
	
	
	void displayTopper(ArrayList<Student>al) {
		Comparator<Student> comp=(i,j) -> {
			if(i.percentage >j.percentage) {return 1;}
			else if(i.percentage<j.percentage) {return -1;}
			else {return 0;}	
		};
		
		
		System.out.println("?//////////////////??????????????????????????????????????????");
		Student l=al.stream().max(comp).get();
		System.out.println("name of topper is  " + l.name);
		System.out.println("id is  " + l.id);
		System.out.println("percentage is  " + l.percentage);
		System.out.println("gen is " + l.gen);
		
		
	}

}
