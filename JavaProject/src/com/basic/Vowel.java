package com.basic;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		System.out.println("Please Enter the Charector");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
			
		
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			System.out.println("This char is vowel");
		}else {
			System.out.println("This char is Consolent");
		}
	}
}
