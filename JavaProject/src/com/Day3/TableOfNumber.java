package com.Day3;

import java.util.Scanner;

public class TableOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a number of table you want :");
		int table = sc.nextInt();
		
		for (int i=1; i<=10; i++) {
			
			System.out.println(table + " * " + i + " = " + table*i);
		}
		
	}

}
