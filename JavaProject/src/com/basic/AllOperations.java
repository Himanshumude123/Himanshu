package com.basic;

import java.util.Scanner;

public class AllOperations {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter your second number");
		int num2 = sc.nextInt();
		
		// perform operations
		
		int Addition = num1 + num2;
		int substraction = num1 - num2;
		int Dividation = num1 / num2;
		int Multiply = num1 * num2;
		
		System.out.println("Addition " + Addition);
		System.out.println("substraction " + substraction);
		System.out.println("Dividation " + Dividation);
		System.out.println("Multiply " + Multiply);
	}
}
