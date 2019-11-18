package com.capgemini.springcore1.annotation.beans;

import com.capgemini.springcore1.interfaces.Animal;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Eating pedigree");
	}

	@Override
	public void speak() {
		System.out.println("dog bow bow");
	}

	@Override
	public void walk() {
		System.out.println("Dog walking ....!!!!");
	}

}
