package com.bridgelabz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserMain {
	/**
	 * PROCEDURE
	 *  1.Creating Scanner Object for taking input from the user
	 *  2.Creating UserRegistration Object to call its methods and setting values
	 *  3.used to call method which perform validations on first name 
	 *  4.used to call method which perform validations on last name
	 *  5.used to call method which perform validations on Email ID 
	 */
	
	/**
	 * 1.Creating Scanner Object for taking input from the user
	 */
	Scanner sc=new Scanner(System.in);
	
	/**
	 * 2.Creating UserRegistration Object to call its methods and setting values
	 */
	UserRegistration ur=new UserRegistration();
	/**
	 * 3.used to call method which perform validations on first name 
	 */
	public boolean userFirstName() {
		System.out.println("Enter first name");
		String firstName=sc.next();
		return ur.firstNameofUser(firstName);
	
		
	}
	
	/**
	 * 4.used to call method which perform validations on last name 
	 */
	public boolean userLastName() {
		System.out.println("Enter Last name");
		String lastName=sc.next();
		return ur.lastNameofUser(lastName);
		
	}
	/**
	 * 5.used to call method which perform validations on Email ID 
	 */
	public void userEmail() {
		/*
		 * System.out.println("Enter User Email ID"); String email=sc.next(); return
		 * ur.emaiIdofUser(email);
		 */
		SampleEmails emails=new SampleEmails();
		emails.TestForValidEmails();
		emails.TestForInValidEmails();
		
	}
	/**
	 * 6.used to call method which perform validations on Mobile Number
	 * @throws IOException 
	 */
	public boolean userPhoneNo() throws IOException {
		
		System.out.println("Enter User Phone Number");
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		String phone=reader.readLine();
		return ur.mobileNumberOfUser(phone);
	}

	/**
	 * 7.used to call method which perform validations on Password
	 */
	private boolean userPassword() {
		System.out.println("Enter User Password");
		String password=sc.next();
		return ur.passwordOfUser(password);
		
	}
	/**
	 * Main method to perform all Validations on User input 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		UserMain user=new UserMain();
		  //user.userFirstName();
		  //user.userLastName();
		  user.userEmail();
		  //user.userPhoneNo();
		  //user.userPassword();
		
	}


	
	
}
