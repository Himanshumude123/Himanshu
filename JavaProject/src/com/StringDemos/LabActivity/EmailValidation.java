package com.StringDemos.LabActivity;

import java.util.Scanner;

public class EmailValidation {

	public static boolean validation(String email) {
		// himanshu@gmail.com 8 - 14 
		int atPosition = email.indexOf('@');
		int dotPosition = email.lastIndexOf('.');

		if (atPosition <= 0 || dotPosition <= atPosition || dotPosition == email.length() - 1) {
			return false;
		}
		for (int i = 0; i < email.length(); i++) {
			char ch = email.charAt(i);

			if (!Character.isLetterOrDigit(ch) && ch != '@' && ch != '.' && ch != '-') {
				return false;
			}

		}
		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Email ID : ");
		String email = sc.nextLine();

		boolean visited = validation(email);

		if (visited) {
			System.out.println("This is Validate Email ID : " + email);
		} else {
			System.out.println("This is Not Valid Email ID...!");
		}

		validation(email);
	}

}
