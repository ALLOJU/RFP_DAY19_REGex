package com.bridgelabz;

import java.util.Scanner;

public class UserMain {

	Scanner sc=new Scanner(System.in);
	UserRegistration ur=new UserRegistration();

	public boolean userFirstName() {
		System.out.println("Enter first name");
		String firstName=sc.next();
		return ur.firstNameofUser(firstName);
		
	}
	public static void main(String[] args) {
		UserMain user=new UserMain();
		user.userFirstName();
	}
}
