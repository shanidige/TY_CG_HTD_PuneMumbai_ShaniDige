package com.capgemini.jdbc;

import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
public class JDBCRetrival {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		ResultSet rs = null;
		try {
			// load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
			System.out.println("*************");

			// get DB connection
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db?user=root&password=root";
			conn = (Connection) DriverManager.getConnection(dbUrl);
			System.out.println("connection established");
			System.out.println("***");

			// ISSUE SQL query
			String query = "SELECT * FROM users_info WHERE userid=? ";
			pstmt = conn.prepareStatement(query);
			System.out.println("enter the user id.....");
			pstmt.setInt(1, sc.nextInt());
			rs = pstmt.executeQuery();

			// process the result
			if (rs.next()) {
				System.out.println("User Id:" + rs.getInt(1));
				System.out.println("User Name:" + rs.getString(2));
				System.out.println("User Email:" + rs.getString(3));
				System.out.println("User Password:" + rs.getString(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		//close  DB connection
		finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
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