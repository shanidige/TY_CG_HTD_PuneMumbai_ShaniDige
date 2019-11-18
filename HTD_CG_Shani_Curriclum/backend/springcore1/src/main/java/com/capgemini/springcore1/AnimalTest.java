package com.capgemini.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore1.beans.Pet;

public class AnimalTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("pet.xml");
		Pet myPet = context.getBean("pet", Pet.class);
		myPet.getAnimal().walk();
		myPet.getAnimal().speak();
		myPet.getAnimal().eat();
	}

}
