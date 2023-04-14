package com.Arrays;

import java.util.Arrays;

public class MinCharFind {

	public static void findMin(char[] ch) {

		char min = ch[0];
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] < min) {
				min = ch[i];
			}

		}
		System.out.println("Given Array --> " + Arrays.toString(ch));
		System.out.println();
		System.out.println("Smallest Charector in Given array is : " + min);
	}

	public static void main(String[] args) {

		char ch[] = { 'A', 'D', 'E', 'x', 'z', 'R' };

		MinCharFind.findMin(ch);
	}
}
