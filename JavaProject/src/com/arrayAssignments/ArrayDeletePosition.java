package com.arrayAssignments;

import java.util.Scanner;

public class ArrayDeletePosition {

	public void deleteElement() {

	}

	public static void main(String[] args) {

		int arr[] = new int[6];

		ArrayDeletePosition ad = new ArrayDeletePosition();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Element :");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the position do you want to delete :");
		int pos = sc.nextInt();

		int size = 5;
		ad.deleteElement();

	}
}
