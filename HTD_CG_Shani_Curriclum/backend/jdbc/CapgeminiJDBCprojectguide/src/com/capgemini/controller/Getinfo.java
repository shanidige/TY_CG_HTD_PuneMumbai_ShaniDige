package com.capgemini.controller;

import java.util.List;
import java.util.Scanner;
import com.capgemini.jdbc.beans.UserBean;
import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.factory.UserFactory;

public class Getinfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserDAO dao = UserFactory.getInstance();
		System.out.println("enter the user id and password");
		// UserBean user = dao.getInfo(sc.nextInt());
		//UserBean user = dao.login(sc.nextInt() ,sc.next());
		List<UserBean> userList = dao.getAllInfo();

		if (userList != null) {
			for (UserBean user : userList) {
				System.out.println(user);
			}
		} else {
			System.out.println("something went wrong...");
		}

		sc.close();

	}

}
