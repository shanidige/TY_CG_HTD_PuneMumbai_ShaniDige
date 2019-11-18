package com.capgemini.springcore1.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcore1.annotation.beans.Pet;
import com.capgemini.springcore1.annotation.config.PetConfig;

public class AnimalTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PetConfig.class);
		Pet pet =context.getBean(Pet.class);
		
		System.out.println(pet.getName());
		pet.getAnimal().walk();		
		pet.getAnimal().speak();
		pet.getAnimal().eat();
	}

}
