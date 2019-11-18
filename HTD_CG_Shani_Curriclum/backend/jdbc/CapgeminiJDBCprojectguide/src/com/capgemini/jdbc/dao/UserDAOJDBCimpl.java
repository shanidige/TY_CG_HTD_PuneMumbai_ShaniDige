package com.capgemini.jdbc.dao;

//import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.IOException;
//import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.jdbc.beans.UserBean;

public class UserDAOJDBCimpl implements UserDAO {
	Properties prop;
	UserBean user;
	PreparedStatement pstmt;

	public UserDAOJDBCimpl() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			FileReader reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	///// login using userid & passwoword

	@Override
	public UserBean login(int userid, String password) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("user"),
				prop.getProperty("password"));

				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query3"));) {
			pstmt.setInt(1, userid);
			pstmt.setString(2, password);
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					user = new UserBean();
					user.setUserid(rs.getInt(1));
					user.setUsername(rs.getString(2));
					user.setEmail(rs.getString(3));

				}
				return user;
			}

			catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	// here we taking normal info

	@Override
	public UserBean getInfo(int userid) {

		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("user"),
				prop.getProperty("password"));

				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query3"));) {
			pstmt.setInt(1, userid);
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					user = new UserBean();
					user.setUserid(rs.getInt(1));
					user.setUsername(rs.getString(2));
					user.setEmail(rs.getString(3));

				}
				return user;
			}

			catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// adding list of user

	public List<UserBean> getAllInfo() {
		List<UserBean> userList = new ArrayList<UserBean>();//create list to users
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("user"),
				prop.getProperty("password"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query"))) {

			while (rs.next()) {
				user = new UserBean();
				user.setUserid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setEmail(rs.getString(3));
				userList.add(user);
			}
			return userList;
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
