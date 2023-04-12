package com.Arrays;

public class ReverseString {

	public void reverse(String s) {

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}

	public static void main(String[] args) {

		String str = "Hello World";

		ReverseString rs = new ReverseString();

		rs.reverse(str);

	}
}
