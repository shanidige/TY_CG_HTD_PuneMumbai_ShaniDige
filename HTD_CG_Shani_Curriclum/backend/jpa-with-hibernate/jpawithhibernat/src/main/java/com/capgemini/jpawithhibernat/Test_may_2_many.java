package com.capgemini.jpawithhibernat;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernat.many_to_many.Course;
import com.capgemini.jpawithhibernat.many_to_many.Student;

public class Test_may_2_many {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;

		Course cs = new Course();
		cs.setCid(1);
		cs.setCname("testing");

		Course cs1 = new Course();
		cs1.setCid(2);
		cs1.setCname("sql");

		ArrayList<Course> al = new ArrayList<Course>();
		al.add(cs);
		al.add(cs1);

		Student s = new Student();
		s.setSid(1);
		s.setName("ram");
		s.setCourse(al);

		Student s1 = new Student();
		s1.setSid(1);
		s1.setName("raju");
		s1.setCourse(al);
		try {
			emf = Persistence.createEntityManagerFactory("Test");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			em.persist(s1);
			System.out.println("saved");
			et.commit();

		} catch (Exception e) {

			e.printStackTrace();
			et.rollback();
		}

	}

}
