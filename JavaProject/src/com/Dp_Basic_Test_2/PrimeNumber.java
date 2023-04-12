package com.Dp_Basic_Test_2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int number;
		int count = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number :");
		number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Given Number Is Prime :");
		} else {
			System.out.println("Given Number Is Not Prime :");
		}
	}
}
