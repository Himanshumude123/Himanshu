package com.Conditional;

import java.util.Scanner;

public class Divisible_By_Five_Or_Eleven {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number To check whether the number is divisible by 5 and 11 or not :");
		int number = sc.nextInt();
		
		if ((number %5==0) && (number%11==0)) {
			System.out.println("\n Given number " + number + ": is the divisible by 5 and 11");
		}else {
			System.out.println("\n Given number " + number + ": is not the divisible by 5 and 11");
		}
	}
}
