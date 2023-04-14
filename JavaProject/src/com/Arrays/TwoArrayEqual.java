package com.Arrays;

import java.util.Arrays;

public class TwoArrayEqual {

	public static void equalOrNot(int arr1[], int arr2[]) {

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		for (int j = 0; j < arr2.length; j++) {
			System.out.print(arr2[j] + " ");
		}
		System.out.println();

		boolean result = Arrays.equals(arr1, arr2);

		if (result == true) {
			System.out.println("Two arrays are equal");
		} else {
			System.out.println("Two arrays are not equal");
		}
	}

	public static void main(String[] args) {

		int arr1[] = { 12, 22, 32, 42, 52, 62 };

		int arr2[] = { 52, 22, 62, 12, 42, 32 };

		TwoArrayEqual.equalOrNot(arr1, arr2);

	}
}
