package com.Exceptions;

import java.io.Serializable;
import java.util.Scanner;

@SuppressWarnings("serial")
class IncorrectLengthPassword extends RuntimeException {

	IncorrectLengthPassword() {
		System.out.println();
	}

	IncorrectLengthPassword(String password) {
		super(password);
	}
}

@SuppressWarnings("serial")
public class LengthCheck extends IncorrectLengthPassword implements Serializable {

	public void checkPassword(String userName, String password) {

		if (password.length() < 8) {
			throw new IncorrectLengthPassword("Password Length must be Greater than 8 Charectors...!");
		} else {
			System.out.println("User Name = " + userName);
			System.out.println("Password = " + password);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the UserName :");
		String userName = sc.next();

		System.out.println("Enter the Password :");
		String password = sc.next();

		LengthCheck lc = new LengthCheck();

		try {
			lc.checkPassword(userName, password);
		} catch (IncorrectLengthPassword i) {
//			i.printStackTrace();
			System.out.println(i.getMessage());
		}

		sc.close();

		System.out.println("Done....!");
	}
}
