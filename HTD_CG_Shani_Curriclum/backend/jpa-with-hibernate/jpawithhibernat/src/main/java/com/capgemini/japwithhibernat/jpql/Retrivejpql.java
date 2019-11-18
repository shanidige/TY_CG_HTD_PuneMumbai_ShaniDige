package com.capgemini.japwithhibernat.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.japwithhibernat.dto.movie;

public class Retrivejpql {

	

	public static void main(String[] args) {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Test");
		EntityManager em=emf.createEntityManager();
		String jpql="from movie";
		Query query=em.createQuery(jpql);
		List<movie> li=query.getResultList();
		for(movie m:li) {
			System.out.println(m.getId());
			System.out.println(m.getMname());
			System.out.println(m.getRating());
		}
		em.close();
	}//end of the main method

}
