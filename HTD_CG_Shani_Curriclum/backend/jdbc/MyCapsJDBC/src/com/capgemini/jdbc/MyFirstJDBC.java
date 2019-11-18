package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBC

{

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// load the Driver
			java.sql.Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("diver is loaded");
			System.out.println("******");
			// get the DB connection via driver
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db?user=root&password=root";
			conn = DriverManager.getConnection(dbUrl);
			System.out.println("connection established");
			System.out.println("***");

			// ISSUE SQL query via connection

			String query = "SELECT * FROM users_info";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			// process the result returned by SQL query
			while (rs.next()) {
				System.out.println("User ID: " + rs.getInt("userid"));
				System.out.println("User name: " + rs.getString("username"));
				System.out.println("Email: " + rs.getString("email"));
				System.out.println("Password:" + rs.getString("password"));
				System.out.println("******************");
			}
		} catch (SQLException e) {
			e.printStackTrace();
//close  DB connection
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}

}
