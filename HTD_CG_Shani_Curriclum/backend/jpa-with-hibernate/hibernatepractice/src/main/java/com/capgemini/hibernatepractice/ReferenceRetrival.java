package com.capgemini.hibernatepractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.hibernatepractice.dto.Shows;

public class ReferenceRetrival {

	public static void main(String[] args) {
		Shows s = new Shows();
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//movie data=entityManager.find(movie.class, 1);
		Shows data=entityManager.getReference(Shows.class, 2);
		System.out.println("id is "+data.getId());
		System.out.println("name is "+data.getName());
		System.out.println("trp is "+data.getTrp());
	}

}
