package com.Arrays;

import java.util.Arrays;

public class EvenAndOdd {

	public static void evenAndOddFind(int arr[]) {

		System.out.println("Given Array :");
		System.out.println(Arrays.toString(arr));

		System.out.println(" Even Numbers :");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}

		System.out.println("\n Odd Number :");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

	public static void main(String[] args) {

		int arr[] = { 12, 7, 32, 42, 52, 62, 17, 15, 35, 63 };
		EvenAndOdd.evenAndOddFind(arr);
	}
}
