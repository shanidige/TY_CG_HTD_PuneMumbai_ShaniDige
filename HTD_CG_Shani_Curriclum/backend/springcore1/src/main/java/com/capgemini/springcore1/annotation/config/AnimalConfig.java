package com.capgemini.springcore1.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore1.annotation.beans.Dog;
import com.capgemini.springcore1.annotation.beans.Panda;

@Configuration
public class AnimalConfig {
	@Primary
	@Bean(name="dog")
	public Dog getDog() {
		return new Dog();
	}
	
	
	@Bean(name="panda")
	public Panda getPanda() {
		return new Panda();
	}
	
}
