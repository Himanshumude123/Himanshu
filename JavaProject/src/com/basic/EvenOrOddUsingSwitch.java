package com.basic;

import java.util.Scanner;
 
public class EvenOrOddUsingSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number :");
		int num = sc.nextInt();

		switch (num % 2) {
		case 0:
			System.out.println(num + ": This Is Even Number");
			break;

		case 1:
			System.out.println(num + ": This Is Odd Number");
			

		}
	
	}
}
