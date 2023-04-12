package com.Looping;

import java.util.Scanner;

public class PrimeNumber {

//	public void checkPrime(int n) {
//		
//	}
	
	public static void main(String[] args) {
		int n;
		int count = 0;
		
		System.out.println("Enter the numbers : ");
		
		Scanner sc = new Scanner (System.in);
		
		n=sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println("Is a primr number");
		}else {
			System.out.println("Not Prime Number");
		}
	}
}
