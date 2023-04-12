package com.basic;

import java.util.Scanner;

public class DivisibleBy3And5 {

	public static void main(String[] args) {

		System.out.println("Enter a number :");
		Scanner sc = new Scanner (System.in);
		int x =sc.nextInt();
		
		if (x%3==0 && x%5==0) {
			System.out.println("This Number Is Divisible by 3 and 5");
		}else {
			System.out.println("This Number is not Divisible by 3 & 5");
		}
	}

}
