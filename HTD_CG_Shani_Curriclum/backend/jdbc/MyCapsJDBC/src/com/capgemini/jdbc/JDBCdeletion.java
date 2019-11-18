package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.Scanner;

public class JDBCdeletion {

	
			public static void main(String[] args) {
				Connection conn = null;
				java.sql.PreparedStatement pstmt = null;
				Scanner sc = new Scanner(System.in);
				
				try {
					// load the driver
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver loaded");
					System.out.println("*************");

					// get DB connection
					String dbUrl = "jdbc:mysql://localhost:3306/capg_db";
					System.out.println("enter username & password");
					String user=sc.nextLine();
					String password=sc.nextLine();
					conn = (Connection) DriverManager.getConnection(dbUrl,user,password);
					System.out.println("connection established");
					System.out.println("***");
					
					// ISSUE SQL query
					String query = "DELETE users_info where password=?";
					pstmt = conn.prepareStatement(query);

					System.out.println("enter userid");
					pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
					int count = pstmt.executeUpdate();
				if (count > 0) {
					System.out.println("data delete");
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

