package com.capgemini.japwithhibernat.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Deletejpql {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		String jpql="delete from movie where id=1";
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Query query=entityManager.createQuery(jpql);
		int result=query.executeUpdate();
		System.out.println("result is "+result);
		transaction.commit();
	entityManager.close();

	}

}
