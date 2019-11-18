package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import java.sql.CallableStatement;

public class Callableexample {

	public static void main(String[] args) {
		Connection conn = null;
		Scanner sc = new Scanner(System.in);
		CallableStatement cstmt = null;
		ResultSet rs = null;
		try {
			// load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(" Driver is loded");
			System.out.println("******");

			// get connection
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db";
			System.out.println("enter username  and password");
			String user = sc.nextLine();
			String password = sc.nextLine();
			conn = (Connection) DriverManager.getConnection(dbUrl, user, password);
			System.out.println("connection established");
			System.out.println("*******");

			// issue SQL query
			String query = "call getallinfo";
			cstmt = conn.prepareCall(query);
			boolean b = cstmt.execute();
			if (b) {
				rs = cstmt.getResultSet();
				while (rs.next()) {
					
				System.out.println("userid:" + rs.getInt(1));
				System.out.println("usernam: " + rs.getString(2));
				System.out.println("email:" + rs.getString(3));
				System.out.println("password:" + rs.getString(4));
				System.out.println("*************");
				}
			} else {
				int i = cstmt.getUpdateCount();
				if (i < 0) {
					System.out.println("operation successful.....");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} 
		//close  DB connection----------------------
		finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (cstmt != null) {
				try {
					cstmt.close();
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
			sc.close();
		}
	}
}