package com.basic;

import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter radius of circle: ");
		double radius = sc.nextFloat();
		double areaCircle = (22 * radius * radius) / 7;
		System.out.println("Area of circle is: " + areaCircle);
	}
}
