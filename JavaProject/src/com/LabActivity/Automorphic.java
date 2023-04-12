package com.LabActivity;

import java.util.Scanner;

public class Automorphic {

	public void automorphic_number() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();

		int count = 0;
		int square = num * num;

		int temp = num;

		while (temp > 0) {
			count++;

			temp = temp / 10;
		}
		int lastDigit = (int) (square % (Math.pow(10, count)));

		if (num == lastDigit) {
			System.out.println("The Number is Automorphic ");

		} else {
			System.out.println("The number is not automorphic ");
		}
	}

	public static void main(String[] args) {
		Automorphic a = new Automorphic();
		a.automorphic_number();
	}
}
