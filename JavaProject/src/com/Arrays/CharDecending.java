package com.Arrays;

public class CharDecending {

	public void sort(char[] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] < c[j]) {
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}

		for (char x : c) {
			System.out.println(x);
		}

	}

	public static void main(String[] args) {

		char ch[] = { 'c', 'e', 'f', 'a', 'z' };

		CharDecending cs = new CharDecending();
		cs.sort(ch);
	}
}
