package com.StringDemos;

import java.util.Scanner;

public class ReverseWordsFromString {

	public static void reverseWord(String str) {

		String st[] = str.split(" ");
		String revers = "";

		for (int i = 0; i < st.length; i++) {
			String word = st[i];
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
		System.out.println("Enter the String : ");
		String str = sc.nextLine();

		ReverseWordsFromString.reverseWord(str);

	}
}
