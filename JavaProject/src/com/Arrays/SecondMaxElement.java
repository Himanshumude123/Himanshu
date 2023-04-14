package com.Arrays;

public class SecondMaxElement {

	public static void secondMinAndMaxElement(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("..............");
		System.out.println("Max Element is : " + arr[arr.length - 1]);
		System.out.println("..............");
		System.out.println("2nd Max Element is : " + arr[arr.length - 2]);
		System.out.println("..............");
		System.out.println("Minimum Element is : " + arr[arr.length - (arr.length - 0)]);
		System.out.println("..............");
		System.out.println("2nd Minimum Element is : " + arr[arr.length - (arr.length - 1)]);

	}

	public static void main(String[] args) {

		int arr[] = { 34, 9, 36, 14, 1, 27, 56, 4 };
		SecondMaxElement.secondMinAndMaxElement(arr);
	}
}
