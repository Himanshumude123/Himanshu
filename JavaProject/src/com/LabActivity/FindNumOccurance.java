package com.LabActivity;

import java.util.Scanner;

public class FindNumOccurance {

	public static void main(String[] args) {

		int num, num1;
		int count = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number :");
		num = sc.nextInt();

		System.out.println("Which Number Do you want to search : ");
		num1 = sc.nextInt();

		while (num > 0) {
			int digit = num % 10;
			if (digit == num1) {
				count++;
			}
			num = num / 10;
		}
		System.out.println("Counted Number Is : " + count);
	}
}
