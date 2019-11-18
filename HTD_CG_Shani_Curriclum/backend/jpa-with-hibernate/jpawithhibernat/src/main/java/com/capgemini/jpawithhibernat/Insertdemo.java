package com.capgemini.jpawithhibernat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.japwithhibernat.dto.movie;

public class Insertdemo {
	
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		movie movie = new movie();
		movie.setId(5);
		movie.setMname("pk");
		movie.setRating("good");
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			 entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(movie);
			System.out.println("record saved");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();

	}// end of main method

}// end of class
