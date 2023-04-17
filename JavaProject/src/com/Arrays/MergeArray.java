package com.Arrays;

public class MergeArray {

	public static void mergeArrays(int arr1[], int arr2[], int arr3[]) {

		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}

		for (int j = 0; j < arr2.length; j++) {
			arr3[arr1.length + j] = arr2[j];
		}

		for (int k = 0; k < arr3.length; k++) {
			System.out.print(arr3[k] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 11, 22, 33, 44, 55 };
		int[] arr2 = { 66, 77, 88, 99 };

		int size = arr1.length + arr2.length;
		int[] arr3 = new int[size];
		MergeArray.mergeArrays(arr1, arr2, arr3);

	}
}
