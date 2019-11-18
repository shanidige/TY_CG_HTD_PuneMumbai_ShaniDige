package com.capgemini.hibernatepractice.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdatejpql {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		String jpql="update Shows set name=: nm , trp=: r where id=:mid";
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Query query=entityManager.createQuery(jpql);
		query.setParameter("mid", 2);
		query.setParameter("nm", "big boss");
		query.setParameter("r", 100);
		
		int result=query.executeUpdate();
		transaction.commit();
		System.out.println("result is "+result);

	entityManager.close();
	}

}
