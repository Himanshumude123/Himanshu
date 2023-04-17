package com.StringDemos;

public class CountCharector {

	public static void countStr(String str) {

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Total Number of Charector in String are : " + count);
	}

	public static void main(String[] args) {

		String str = "Hello World";

		CountCharector.countStr(str);

	}
}
