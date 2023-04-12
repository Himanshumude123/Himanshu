package com.OOPS;

public class TableOfFiveNum {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			
			System.out.println("Multiplication table of " + i + ":");
			
			for (int j = 1; j <= 10; j++) {
				
				int result = i * j;
				
				System.out.println(i + " * " + j + " = " + result);
			}
			System.out.println();
		}
	}
}
