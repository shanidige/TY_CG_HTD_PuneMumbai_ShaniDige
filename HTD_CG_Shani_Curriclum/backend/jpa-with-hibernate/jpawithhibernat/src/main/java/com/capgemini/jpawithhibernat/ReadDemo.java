package com.capgemini.jpawithhibernat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.japwithhibernat.dto.movie;

public class ReadDemo {

	public static void main(String[] args) {
		movie movie = new movie();
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		movie data=entityManager.find(movie.class, 1);
		System.out.println("id is "+data.getId());
		System.out.println("nmae is "+data.getMname());
		System.out.println("rating is"+data.getRating());

	}//end of main method

}//end of class
