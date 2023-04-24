package com.StringDemos.LabActivity;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWordFromString {

	public static void reverseWord(String str) {

		String s[] = str.split(" ");
		String revers = "";

		for (int i = 0; i < s.length; i++) {
			String word = s[i];
			String reverseword = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				reverseword = reverseword + word.charAt(j);
			}

			revers = revers + " " + reverseword;
			s[i] = revers;
		}

		System.out.println(revers);
		System.out.println(Arrays.toString(s));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");

		String str = sc.nextLine();

		ReverseWordFromString.reverseWord(str);
	}
}
