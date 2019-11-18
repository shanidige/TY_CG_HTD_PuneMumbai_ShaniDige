package com.capgemini.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCRetrivalALL {

	public static void main(String[] args) {
		Connection conn = null;
		Properties prop = null;
		FileReader reader = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {

			// load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
			System.out.println("*************");

			
			reader = new FileReader("C:\\Users\\Prafull\\Desktop\\db.properties");
			prop = new Properties();
			prop.load(reader);

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			// get the connection
			String dburl = "jdbc:mysql://localhost:3306/capg_db";
			conn = DriverManager.getConnection(dburl, prop);
			System.out.println("connection established");
			System.out.println("**********************************");

			// issue he query
			String query = "SELECT * FROM users_info";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				System.out.println("id is " + rs.getInt(1));
				System.out.println("name is " + rs.getString(2));
				System.out.println("email is " + rs.getString(3));
				System.out.println("password is " + rs.getString(4));
				System.out.println("*********");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		// closing DB connection
		finally {
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