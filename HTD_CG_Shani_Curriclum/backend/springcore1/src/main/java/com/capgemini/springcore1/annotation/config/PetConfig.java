package com.capgemini.springcore1.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.capgemini.springcore1.annotation.beans.Pet;

@Import(AnimalConfig.class)
@Configuration
public class PetConfig {

	@Bean
	public Pet getPet() {
		Pet myPet = new Pet();
		myPet.setName("rocky");
		return myPet;
	}

}
