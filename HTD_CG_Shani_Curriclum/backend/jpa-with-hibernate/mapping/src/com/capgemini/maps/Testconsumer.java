package com.capgemini.maps;

import java.util.function.Consumer;

public class Testconsumer {

	public static void main(String[] args) {
		Consumer<Student> c = (s) -> {
			System.out.println("name is " + s.name);
			System.out.println("id is " + s.id);
			System.out.println("percentage is " + s.percentage);
		};

		Student s1 = new Student(1, "divya", 78.4, 'f');
		c.accept(s1);
	}

}