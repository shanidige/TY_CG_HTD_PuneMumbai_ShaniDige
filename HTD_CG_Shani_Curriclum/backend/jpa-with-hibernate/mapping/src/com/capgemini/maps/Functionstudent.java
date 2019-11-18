package com.capgemini.maps;

import java.util.function.Function;

public class Functionstudent {

	public static void main(String[] args) {
		Function<Integer, Student> f = i -> {
			Student s = new Student();
			s.id = i;
			return s;
		};

		Student s = f.apply(10);
		System.out.println("name is  " + s.name);
		System.out.println("id is  " + s.id);
		System.out.println("percentage is  " + s.percentage);
	}

}
