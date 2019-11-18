package flipkart.controller;

import java.util.Scanner;

import flipkart.Beans.ProductBeans;
import flipkart.dao.Productdao;
import flipkart.factory.Productfactory;

public class ProductMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Productdao dao = Productfactory.getInstance();

		System.out.println("Press 1 to show all Product");
		System.out.println("press 2 to for payment for your product ");
		int button = sc.nextInt();

		if (button == 1) {
			ProductBeans dao1 = dao.displayallproduct();
		} else if (button == 2) {
			ProductBeans dao2 = dao.addcartproduct();
		} else {
			System.out.println("kindly please check your choice ");
		}
	}

}
