package com.capgemini.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPractice {

	public static void main(String[] args) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int rs1;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/flipkart?user=root&password=root";
			conn = (Connection) DriverManager.getConnection(dbUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" PLEASE ENTER 1 OR 2 ");
		int n = sc.nextInt();
		switch (n) {
		case 1: {
			try {
				String query = "SELECT * FROM product_info ";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(query);
				while (rs.next()) {
					System.out.println("id  " + rs.getInt(1));
					System.out.println("name " + rs.getString(2));
					System.out.println("cost " + rs.getInt(3));
					System.out.println("colour " + rs.getString(4));
					System.out.println(" description " + rs.getString(5));
					System.out.println("********");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			break;
		case 2: {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String dbUrl = "jdbc:mysql://localhost:3306/flipkart?user=root&password=root";
				conn = (Connection) DriverManager.getConnection(dbUrl);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(" ENTER '1'  TO ADD PRODUCT IN CART OR '2'  FOR PAYMENT ");
			int b = sc.nextInt();
			switch (b) {
			case 1: {
				String query = "INSERT INTO owner values(?)";
				try {
					pstmt = conn.prepareStatement(query);
					System.out.println("enter the product name.....");
					pstmt.setString(1, sc.nextLine());
					/*
					 * System.out.println("enter product cost......"); pstmt.setInt(2,
					 * sc.nextInt()); System.out.println("colour of a products.....");
					 * pstmt.setString(3, sc.nextLine());
					 */
					
					
					int count=pstmt.executeUpdate();
					if (count > 0) {
						System.out.println("data inserted");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
				break;
			case 2: {
				System.out.println("FOR PAYMENT PLEASE ENTER YOUR CARD NUMBER ");
				Pattern pat = Pattern.compile("\\d{16}");
				long r = sc.nextLong();
				String str1 = Long.toString(r);
				Matcher mat = pat.matcher(str1);

				if (mat.matches()) {
					System.out.println("PLEASE ENTER YOUR CVV NUMBER ");
					Pattern pat1 = Pattern.compile("\\d{3}");
					int k = sc.nextInt();
					String str2 = Integer.toString(k);
					Matcher mat1 = pat1.matcher(str2);
					if (mat1.matches()) {
						System.out.println("TRANSCATION IS SUCCESSFULL");
					} else {
						System.out.println("PLEASE ENTER VALID  CVV NO");
					}
				} else {
					System.out.println("!!! PLEASE ENTER CORRECT DETAILS  !!!");
				}
			}
				break;
				default:{
					System.out.println("SORRY  WRONG CHOICE");
				}
			}
		}
			System.out.println("Thank you!");
		}
	}
}