package com.basic;

import java.util.Scanner;

public class Day2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("1.Monday \n 2.Tuesday \n 3.Wednesday \n 4.Thrusday \n 5.Friday \n 6.Saturday \n 7.Sunday");

	System.out.println("Enter Your Choise between 1 to 7 :");
	int num = sc.nextInt();
	
	if (num==1) {
		System.out.println("This is a Monday");
	}else if (num==2) {
		System.out.println("This is a Tuesday");
	}else if (num==3) {
		System.out.println("This is a Wednesday");
	}else if (num==4) {
		System.out.println("This is a Thrusday");
	}else if (num==5) {
		System.out.println("This is a Friday");
	}else if (num==6) {
		System.out.println("This is a Saturday");
	}else if (num==7) {
		System.out.println("This is a Sunday");
	}else {
		System.out.println("Invalid Input...!");
	}
	
}
	
}
