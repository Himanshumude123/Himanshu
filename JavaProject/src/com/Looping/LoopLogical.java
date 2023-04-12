package com.Looping;

import java.util.Scanner;

// sum of digit number 15 = 1+5 = 6;
public class LoopLogical {

	public void digitSum(int num) {
		int sum = 0;

		while (num > 0) {
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();

		LoopLogical l = new LoopLogical();
		l.digitSum(n);
	}
}
