package com.capgemini.jpawithhibernat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.japwithhibernat.dto.movie;

public class DeleteDemo {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		/*
		 * movie movie = new movie(); movie.setId(3); movie.setMname("ABCD3");
		 * movie.setRating("Average");
		 */
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			movie data =entityManager.find(movie.class, 1);
			entityManager.remove(data);
			/* entityManager.persist(movie); */
			System.out.println("record delete");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
	}

}
