package com.capgemini.jdbc;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Connection;

public class JDBCIinsertion {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		Scanner sc=new Scanner(System.in);
		java.sql.PreparedStatement pstmt = null;
		try {
			// load the Driver
			java.sql.Driver driver = new com.mysql.jdbc.Driver();
			Class.forName("com.mysql.jdbc.Driver");/// no need of
			System.out.println("Driver is loaded");
			System.out.println("************");
			// get the connection

			String dbUrl = "jdbc:mysql://localhost:3306/capg_db?user=root&password=root";
			conn = (Connection) DriverManager.getConnection(dbUrl);
			System.out.println("connection established");
			System.out.println("***");

			String query = "INSERT INTO users_info values(?,?,?,?)"; ///taking values from user
			pstmt = conn.prepareStatement(query);
			System.out.println("enter userid");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			System.out.println("enter username");
			pstmt.setString(2,sc.nextLine());
			System.out.println("enter email id");
			pstmt.setString(3,sc.nextLine());
			System.out.println("enter the password");
			pstmt.setString(4,sc.nextLine());
			
			int count=pstmt.executeUpdate();
			//process the result
			
			if (count > 0) {
				System.out.println("data inserted");
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
	}
	}

}
