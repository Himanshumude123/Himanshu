package com.Arrays.TwoDiamentional;

import java.util.Scanner;

public class Addition {

	public static void additionOfTwoArr(int arr[][], int arr1[][], int arr2[][]) {
		System.out.println("1st Array ");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("2nd Array ");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("................................");

		System.out.println("Addition of 2 Array ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (arr1[i][j]) + (arr2[i][j]);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}

	}

	public static void main(String[] args) {
		int arr[][] = new int[2][2];
		int arr1[][] = new int[2][2];
		int arr2[][] = new int[2][2];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 1st Arrays Elements :");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the 2nd Arrays Elements :");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		Addition.additionOfTwoArr(arr, arr1, arr2);

	}
}
