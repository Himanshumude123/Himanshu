package com.StringDemos.LabActivity;

import java.util.Scanner;

public class FrequencyOfCharector {

	public static void findFrequency(String str) {

		char s[] = str.toCharArray();

		for (int i = 0; i < s.length; i++) {

			boolean visited = false;
			int count = 1;
			for (int j = i - 1; j >= 0; j--) {

				if (s[i] == s[j]) {
					visited = true;
					break;
				}
			}
			if (visited == false) {
				for (int k = i + 1; k < s.length; k++) {
					if (s[i] == s[k]) {
						count++;
					}
				}

				if (count >= 1) {
					System.out.println("Element is :" + s[i] + "--->" + "Count is :" + count);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();

		FrequencyOfCharector.findFrequency(str);
	}
}
