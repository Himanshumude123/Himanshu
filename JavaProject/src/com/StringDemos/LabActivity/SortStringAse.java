package com.StringDemos.LabActivity;

import java.util.Arrays;

public class SortStringAse {

	public void sortString(String str[]) {

		String s[] = str;

		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].compareTo(s[j]) > 0) {
					String temp1 = s[i];
					s[i] = s[j];
					s[j] = temp1;
				}
			}
		}

		System.out.println(Arrays.toString(s));

	}

	public static void main(String[] args) {

		String str[] = { "pune", "mumbai", "bangalore", "nagpur", "hyderabad" };

		SortStringAse sa = new SortStringAse();
		sa.sortString(str);
	}
}
