package com.StringDemos.LabActivity;

import java.util.Scanner;

public class EmailValidationOFString {

	public void validation(String str) {
		
		boolean visited = false;
		
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if((ch>='a' && ch<= 'z' )|| (ch>='A' && ch<='z') && (ch>='0' && ch<='9') &&  )
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();

		EmailValidationOFString email = new EmailValidationOFString();
		email.validation(str);

	}
}
