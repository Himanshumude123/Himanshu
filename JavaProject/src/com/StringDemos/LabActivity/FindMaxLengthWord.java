package com.StringDemos.LabActivity;

import java.util.Scanner;

public class FindMaxLengthWord {

	public static void findMaxWord(String str) {

		String s = str;
		s = s.toLowerCase();
		String[] word = s.split(" ");

		String longest = word[0];

		for (int i = 1; i < word.length; i++) {

			if (word[i].length() > longest.length()) {
				longest = word[i];
			}
		}
		System.out.println("Longest word in given string : " + longest);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String :");
		String str = sc.nextLine();

		FindMaxLengthWord.findMaxWord(str);

	}
}
