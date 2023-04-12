package com.basic;

import java.util.Scanner;

// write a code to find the greatest number between three numbers;

public class GrestestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number 1");
		int n1 = sc.nextInt();

		System.out.println("Enter the Number 2");
		int n2 = sc.nextInt();

		System.out.println("Enter the Number 3");
		int n3 = sc.nextInt();

		if (n1 >= n2 && n1 >= n3) {
			System.out.println(n1 + " Is a Greatest Number");
		} else if (n2 >= n3 && n2 >= n1) {
			System.out.println(n2 + " Is a Greatest Number");
		} else {
			System.out.println(n3 + " Is a Greatest Number");
		}
	}

}
