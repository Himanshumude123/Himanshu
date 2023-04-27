package com.Arrays;

import java.util.Scanner;

public class CharFreq {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = "Java is a programming language";

		System.out.println(str);
		int count = 0;
		System.out.println("Enter the charector Frequency find :");
		char ch = sc.next().charAt(0);

		char c[] = str.toCharArray();

		for (int i = 0; i < c.length; i++) {

			if (c[i] == ch) {
				count++;
			}
		}

		System.out.println(ch + " " + count);
	}
}
