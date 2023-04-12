package com.Arrays;

import java.util.Scanner;

public class SearchIndex {

	public void search(int[] a, int s1) {

		int i;

		int count = 0;

		for (i = 0; i < a.length; i++) {
			if (a[i] == s1) {
				count = 1;
				break;
			}

		}
		if (count == 1) {
			System.out.println("Intex of Given number is : " + i + ", Number is : " + a[i]);
		} else {
			System.out.println("The number is not found : ");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");

		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter the Elements for Array");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Search element from array :");
		int s1 = sc.nextInt();

		SearchIndex s = new SearchIndex();
		s.search(arr, s1);

	}
}
