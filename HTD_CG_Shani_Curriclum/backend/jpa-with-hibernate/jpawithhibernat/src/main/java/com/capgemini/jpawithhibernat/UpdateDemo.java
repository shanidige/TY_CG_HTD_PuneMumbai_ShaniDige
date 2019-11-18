package com.capgemini.jpawithhibernat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.japwithhibernat.dto.movie;

public class UpdateDemo {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			movie data = entityManager.find(movie.class, 2);
			data.setMname("pk");//we use setter method as there
		
			data.setRating("good");//we use setter method
			System.out.println("record update");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
	}

}
