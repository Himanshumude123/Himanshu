package com.Arrays.TwoDiamentional;

public class SumOfColoumn {

	public static void coloumnSum(int arr[][]) {

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[j][i];
				System.out.print(arr[i][j] + " ");
			}
			System.out.print(" Sum :" + sum);
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		SumOfColoumn.coloumnSum(arr);
	}
}
