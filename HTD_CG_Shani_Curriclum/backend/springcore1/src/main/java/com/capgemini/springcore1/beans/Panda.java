package com.capgemini.springcore1.beans;

import com.capgemini.springcore1.interfaces.Animal;

public class Panda implements Animal {

	@Override
	public void eat() {
		System.out.println("Eating Bamboo");
	}

	@Override
	public void speak() {
		System.out.println("Panda Squeaks");
	}

	@Override
	public void walk() {
		System.out.println("panda walking ...................................................");
	}

}
