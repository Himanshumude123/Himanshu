package com.basic;

import java.util.Scanner;

public class UppercaseAndLowercase {

	public static void main(String[] args) {

		System.out.println("Please Enter a Charecter : ");
		Scanner sc = new Scanner(System.in);

		char ch = sc.next().charAt(0);

		if (ch >= 'a' && ch <= 'z') {
			System.out.println("This alphabet is in Lowercase");
		} else {
			System.out.println("This alphabet is in Uppercase ");
		}

	}
}
