package com.StringDemos;

import java.util.Scanner;

public class ReversExceptWordsFromString {

	public static void reverseExceptWords(String str) {

		String s[] = str.split(" ");

		String revers = "";

		for (int i = 1; i < s.length - 1; i++) {
			String word = s[i];
			String reversword = "";

			for (int j = word.length() - 1; j >= 0; j--) {

				reversword = reversword + word.charAt(j);

			}

			revers = revers + " " + reversword;
		}
		System.out.println(revers);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();

		ReversExceptWordsFromString.reverseExceptWords(str);
	}
}
