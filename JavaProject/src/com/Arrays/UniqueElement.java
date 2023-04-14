package com.Arrays;

import java.util.Arrays;

public class UniqueElement {

	public static void unique(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			boolean visited = false;

			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] == arr[j]) {
					visited = true;
					break;
				}
			}

			if (visited == false) {
				for (int k = i + 1; k < arr.length; k++) {
					if (arr[i] == arr[k]) {
						count++;
					}
				}

				if (count == 1) {
					// System.out.println(" " + arr[i] + "----->" + count);

					System.out.println("Unique Element From an Array are : " + arr[i]);
				}

			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 1, 2, 0, -1, 4, 5, 4, 1, 2, 0 };
		UniqueElement.unique(arr);
	}
}
