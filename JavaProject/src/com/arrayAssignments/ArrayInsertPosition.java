package com.arrayAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertPosition {

	public void insertElement(int arr[], int pos, int new_val, int size) {

		for (int i = size - 1; i >= pos; i--) {
			arr[i + 1] = arr[i];
		}
		arr[pos] = new_val;

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		int arr[] = new int[6];

		ArrayInsertPosition ap = new ArrayInsertPosition();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Element :");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the Position Do you want :");
		int pos = sc.nextInt();

		System.out.println("Enter the New Value :");
		int new_val = sc.nextInt();

		int size = 5;
		ap.insertElement(arr, pos, new_val, size);
	}
}
