package com.StringBufferBuilder;

import java.util.Scanner;

public class Palindrom {

	public static void checkPalindrom(String str) {

		String s = str;

		StringBuffer sb = new StringBuffer(s);
		sb.reverse();

		//System.out.println(sb);

		s = sb.toString();

		//System.out.println(s);

		if (s.equals(str)) {
			System.out.println(s + " Is a palindrom...!");
		} else {
			System.out.println(s + " Not Palindrom...!");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String :");
		String str = sc.nextLine();

		Palindrom.checkPalindrom(str);
	}
}
