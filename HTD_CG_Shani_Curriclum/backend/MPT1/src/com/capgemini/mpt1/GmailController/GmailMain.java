package com.capgemini.mpt1.GmailController;

import java.util.Scanner;

import com.capgemini.mpt1.GmailBean.GmailBeans;
import com.capgemini.mpt1.GmailFactory.Gmailfactory;
import com.capgemini.mpt1.Gmaildao.Gmaildao;

public class GmailMain {

	public static void main(String[] args) {

		Gmaildao dao = Gmailfactory.getInstance();

		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to login");
		System.out.println("press 2 to register");

		int button = Integer.parseInt(sc.nextLine());

		if (button == 1) {
			System.out.println("enter your email id");
			String email = sc.nextLine();
			System.out.println("enter your password");
			String password2 = sc.nextLine();
			GmailBeans dao1 = dao.login(email,password2);

			System.out.println("press A for compose");
			System.out.println("press B to see inbox");
			String choice = sc.nextLine();
			if (choice.equals("A")) {
				System.out.println("enter email id to compose the message");
				String email_id = sc.nextLine();
				System.out.println("type your message");
				String msg = sc.nextLine();
				GmailBeans dao2 = dao.compose(email_id, msg);
			} else if (choice.equals("B")) {
				System.out.println("enter email id to compose the message");
				String email_id1 = sc.nextLine();
				GmailBeans dao3 = dao.showinbox(email_id1);
			} else {
				System.out.println("wrong choice");
			}
		} else if (button == 2) {
			System.out.println("enter new user id to create  gmail account");
			int userid = Integer.parseInt(sc.nextLine());
			System.out.println("enter new user name");
			String username = sc.nextLine();
			System.out.println("enter new password");
			String password = sc.nextLine();
			System.out.println("enter new email id ");
			String email_id1 = sc.nextLine();
			GmailBeans dao4 = dao.register(userid, username, password, email_id1);
		} else {
			System.out.println("please check your option");
		}
	}
}
