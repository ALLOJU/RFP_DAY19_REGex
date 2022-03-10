package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public String regex;

	public boolean firstNameofUser(String firstName) {
		/**
		 *  Regex to check valid username.
		 */


		regex="^[A-Z][a-z]{2}";

		/**
		 * To compile Regular Expression
		 */
		Pattern p=Pattern.compile(regex);
		// If the firstName is empty
		// return false
		if (firstName == null) {
			return false;
		}
		/**
		 * Pattern class contains matcher() method  to find matching between given firstName
           and regular expression.
		 */
		Matcher m=p.matcher(firstName);
		System.out.println(m.matches());
		
		return m.matches();
		

	}

	public boolean lastNameofUser(String lastName) {
		regex="^[A-Z][a-z]{2}";
		Pattern p=Pattern.compile(regex);
		if (lastName == null) {
			return false;
		}
		/**
		 * Pattern class contains matcher() method  to find matching between given lastname
           and regular expression.
		 */
		Matcher m=p.matcher(lastName);
		System.out.println(m.matches());
		
		return m.matches();
	}

}
