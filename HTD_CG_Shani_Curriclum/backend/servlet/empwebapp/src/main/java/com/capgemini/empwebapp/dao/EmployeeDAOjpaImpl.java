package com.capgemini.empwebapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.empwebapp.beans.EmployeeInfoBean;

public class EmployeeDAOjpaImpl implements EmployeeDAO {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeePersistenceUnit");

	@Override
	public EmployeeInfoBean getEmployee(int empId) {

		EntityManager em = emf.createEntityManager();
		EmployeeInfoBean employeeInfoBean = em.find(EmployeeInfoBean.class, empId);
		em.close();
		return employeeInfoBean;
	}

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		EntityManager em = emf.createEntityManager();
		String jpql = "from EmployeeInfoBean where empId= :empId and password= : password";
		Query query = em.createQuery(jpql);
		query.setParameter("empId", empId);
		query.setParameter("password", password);

		EmployeeInfoBean employeeInfoBean = null;
		try {
			employeeInfoBean = (EmployeeInfoBean) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employeeInfoBean;
	}// end of authenticate

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		boolean isAdded = false;
		try {
			tx.begin();
			em.persist(employeeInfoBean);
			tx.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		return isAdded;
	}// end of addmethod

	@Override
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		EmployeeInfoBean infoBean = em.find(EmployeeInfoBean.class, employeeInfoBean.getEmpId());
		if (infoBean != null) {
			String name = employeeInfoBean.getEmpName();
			{
				if (name != null) {
					infoBean.setEmpName(name);
				}
				String gen = employeeInfoBean.getGender();
				{
					infoBean.setGender(gen);
				}
				int age = employeeInfoBean.getAge();
				{
					infoBean.setAge(age);
				}
				long mobile = employeeInfoBean.getMobile();
				{
					infoBean.setMobile(mobile);
				}
				String design = employeeInfoBean.getDesignation();
				{
					infoBean.setDesignation(design);
				}
				double sal = employeeInfoBean.getSalary();
				{
					infoBean.setSalary(sal);
				}
				String password = employeeInfoBean.getPassword();
				{
					infoBean.setPassword(password);
				}
			}
			boolean isUpdate = false;
			try {
				tx.begin();
				em.persist(employeeInfoBean);
				tx.commit();
				isUpdate = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			em.close();
			return isUpdate;
		}
		return false;

	}
}
