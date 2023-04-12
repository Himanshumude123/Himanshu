package com.basic;

import java.util.Scanner;

public class Areas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU:");
		System.out.println("1.Area of circle");
		System.out.println("2.Area of triangle");
		System.out.println("3.Area of rectangle");
		System.out.println("Please enter any of the above option: ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("Please enter radius of circle: ");
			double radius = sc.nextFloat();
			double areaCircle = (22 * radius * radius) / 7;
			System.out.println("Area of circle is: " + areaCircle);
			break;
		case 2:
			System.out.println("Please enter base and height of triangle: ");
			double base = sc.nextFloat();
			double height = sc.nextFloat();
			double areaTriangle = (base * height) / 2;
			System.out.println("Area of triangle is: " + areaTriangle);
			break;
		case 3:
			System.out.println("Please enter length and breadth of rectangle: ");
			int length = sc.nextInt();
			int breadth = sc.nextInt();
			int areaRectangle = length * breadth;
			System.out.println("Area of ractangle is: " + areaRectangle);
			break;
		default:
			System.exit(0);
		}
		sc.close();
	}
}
