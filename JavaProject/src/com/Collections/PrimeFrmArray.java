package com.Collections;

import java.util.Arrays;

public class PrimeFrmArray {

	public static void displayPrime(int arr[]) {

		int i;
		int j;
		int count = 0;

		Arrays.sort(arr);

		for (i = 0; i < arr.length; i++) {
			count = 0;
			for (j = 2; j < arr[i]; j++) {
				if (arr[i] % j == 0) {
					count = 1;
					break;
				}
			}

			if (count == 0) {
				System.out.println("Prime number : " + arr[i]);
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 2, 4, 5, 8, 7, 9, 6, 3, 12, 15, 23};

		displayPrime(arr);
	}
}
