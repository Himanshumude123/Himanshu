package com.Arrays;

public class Frequency {

	public static void findElements(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			boolean visited = false;
			int count = 1;
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
				System.out.println("Element is :" + arr[i] + "--->" + "Count is :" + count);
			}

		}

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 1, 2, 0, -1, 4, 5, 4, 1, 2, 0 };
		Frequency.findElements(arr);

	}
}
