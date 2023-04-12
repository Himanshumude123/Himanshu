package com.Dp_Basic_Test_2;

import java.util.Scanner;

public class SpyNumber_4 {

	public static void main(String[] args) {

		int product = 1;
		int sum = 0;
		int id;
		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number : ");
		num = sc.nextInt();

		while (num > 0) {
			id = num % 10;
			sum = sum + id;
			product = product * id;

			num = num / 10;
		}

		if (sum == product) {
			System.out.println("its a Spy number ");
		} else {
			System.out.println("Its not spy number  ");
		}
	}
}
