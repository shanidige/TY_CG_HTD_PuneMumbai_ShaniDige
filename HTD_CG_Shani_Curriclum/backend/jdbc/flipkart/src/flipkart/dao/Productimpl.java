package flipkart.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import flipkart.Beans.ProductBeans;

public class Productimpl implements Productdao {
	PreparedStatement pstmt = null;
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	Scanner sc = new Scanner(System.in);

	// no arugment constructor
	public Productimpl() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/flipkart?user=root&password=root";
			conn = DriverManager.getConnection(dburl);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ProductBeans displayallproduct() {
		try {
			String query = "SELECT * FROM product ";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println("item_id  " + rs.getInt(1));
				System.out.println("name " + rs.getString(2));
				System.out.println("cost " + rs.getDouble(3));
				System.out.println("********");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public ProductBeans addcartproduct() {
		System.out.println(" ENTER '1'  TO ADD PRODUCT IN CART OR '2'  FOR PAYMENT ");
		int b = sc.nextInt();
		switch (b) {
		case 1: {
			String query = "select * from product where item_id=?";
			try {
				pstmt = conn.prepareStatement(query);
				System.out.println("enter the product id");
				pstmt.setInt(1, sc.nextInt());
				System.out.println("enter the product name");
				pstmt.setString(2, sc.nextLine());
				System.out.println("enter the cost");
				pstmt.setDouble(3, sc.nextDouble());

				rs = pstmt.executeQuery();
				if (rs.next()) {
					System.out.println("proct add to cart");
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
		default: {
			System.out.println("SORRY  WRONG CHOICE");
		}
		}
		return null;
	}

}
