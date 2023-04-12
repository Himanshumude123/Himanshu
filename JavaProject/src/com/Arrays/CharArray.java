package com.Arrays;

import java.util.Arrays;

public class CharArray {

	public void changeChar(char c[]) {

		for (int i = 0; i < c.length; i++) {
			c[i] = (char) (c[i] + 2);
		}
		System.out.println(Arrays.toString(c));
	}

	public static void main(String[] args) {

		char ch[] = { 'a', 'e', 'i', 'o', 'u' };

		CharArray r = new CharArray();
		r.changeChar(ch);

	}
}
