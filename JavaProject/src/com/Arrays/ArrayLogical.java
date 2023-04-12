package com.Arrays;

import java.util.Scanner;

public class ArrayLogical {
	// Display odd Element from array
	public void findOddElements(int a[]) {
		System.out.println("Odd Elements From An Array = ");

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}
	}

	public void displayEvenPosition(int a[]) {
		System.out.println("Display Even Position of Array :");

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public void displaySumOfOddElement(int a[]) {
		System.out.println("Display Sum of Odd Eement :");

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				sum = sum + a[i];
			}
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");

		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements for Array");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		ArrayLogical al = new ArrayLogical();
		al.findOddElements(arr);

		System.out.println("...............");
		al.displayEvenPosition(arr);

		System.out.println("...............");
		al.displaySumOfOddElement(arr);
	}
}
