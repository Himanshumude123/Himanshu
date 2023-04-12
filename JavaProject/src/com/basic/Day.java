package com.basic;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {

		System.out.println("Wlcome to The Week :");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();

		System.out.println("1.Monday \n 2.Tuesday \n 3.Wednesday \n 4.Thrusday \n 5.Friday \n 6.Saturday \n 7.Sunday");

		System.out.println("Enter Your Choise between 1 to 7 :");

		switch (num) {
		case 1:
			System.out.println("Monday :" + (num == 1));
			break;

		case 2:
			System.out.println("Tuesday :" + (num == 2));
			break;

		case 3:
			System.out.println("Wednesday :" + (num == 3));
			break;

		case 4:
			System.out.println("Thrusday :" + (num == 4));
			break;

		case 5:
			System.out.println("Friday :" + (num == 5));
			break;

		case 6:
			System.out.println("Saturday :" + (num == 6));
			break;

		case 7:
			System.out.println("sunday :" + (num == 7));
			break;

		default:
			System.out.println("The number is Invalid");
		}
	}
}
