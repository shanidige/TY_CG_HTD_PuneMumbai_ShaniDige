package com.capgemini.mpt1.Gmaildao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.capgemini.mpt1.GmailBean.GmailBeans;

public class Gmailimpl implements Gmaildao {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	Scanner sc = new Scanner(System.in);

	public Gmailimpl() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("....Driver is loaded....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public GmailBeans login(String email, String password) {
		String dburl = "jdbc:mysql://localhost:3306/gmail?usert=root&password=root";
		try {
			conn = DriverManager.getConnection(dburl);

			String query = "select * from Account where email=? AND password=?";
			stmt = conn.createStatement();

			rs = stmt.executeQuery(query);
			if (rs.next()) {
				System.out.println(" enter your email " + rs.getString(4));
				System.out.println("enter your password " + rs.getString(3));
				System.out.println("you log sucessfully");
			}
		} // end of try
		catch (Exception e) {
			e.printStackTrace();
		} // end of catch
		return null;
	}// end of login override method

	@Override
	public GmailBeans compose(String email, String message) {
		String dburl = "jdbc:mysql://localhost:3306/gmail?usert=root&password=root";
		try {
			conn = DriverManager.getConnection(dburl);
			String query = "select *from Account where email=?";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				System.out.println(" enter your email " + rs.getString(4));
			}
			String query1 = "insert into Inbox values (?)";
			pstmt.setString(3, sc.nextLine());
			pstmt = conn.prepareStatement(query1);
			int count = pstmt.executeUpdate();
			if (count > 0) {
				System.out.println("msg is sended");
			} // end of if
		} // end of try
		catch (Exception e) {
			e.printStackTrace();
		} // end of catch

		return null;
	}// end of compose override method

	@Override
	public GmailBeans showinbox(String email) {
		String dburl = "jdbc:mysql://localhost:3306/gmail?usert=root&password=root";
		try {
			conn = DriverManager.getConnection(dburl);
			String query = "select *from Account where email=?";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				System.out.println(" enter your email " + rs.getString(4));
			} // end of if
		}
		// end of try
		catch (Exception e) {
			e.printStackTrace();
		} // end of catch
		return null;
	}//end of  showinbox override method
	
	

	@Override
	public GmailBeans register(int userid,String user_name, String password, String email) {
		String dburl = "jdbc:mysql://localhost:3306/gmail?usert=root&password=root";
		try {
			conn = DriverManager.getConnection(dburl);
			String query2="insert into Account values(?,?,?,?)";
			pstmt=conn.prepareStatement(query2);
			System.out.println("enter new user id to create  gmail account");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			System.out.println("enter new user name");
			pstmt.setString(2,sc.nextLine());
			System.out.println("enter new password");
			pstmt.setString(3,sc.nextLine());
			System.out.println("enter new email id ");
			pstmt.setString(4,sc.nextLine());
			
			int count = pstmt.executeUpdate();
			if(count>0) {
				System.out.println("your registration is completed");
				System.out.println("thank you!");
			}//end of try
		} catch (Exception e) {
			e.printStackTrace();
		}//end of catch

		return null;
	}//end of register override method
}
