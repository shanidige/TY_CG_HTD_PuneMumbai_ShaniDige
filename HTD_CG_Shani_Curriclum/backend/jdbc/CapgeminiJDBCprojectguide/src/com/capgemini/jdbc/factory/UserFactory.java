package com.capgemini.jdbc.factory;

import com.capgemini.jdbc.dao.UserDAOJDBCimpl;
import com.capgemini.jdbc.dao.UserDAO;

public class UserFactory {
	private UserFactory() {

	}

	public static UserDAO getInstance() {
		UserDAO dao = new UserDAOJDBCimpl();
		return dao;
	}
}
