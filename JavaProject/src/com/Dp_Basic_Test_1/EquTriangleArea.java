package com.Dp_Basic_Test_1;

import java.util.Scanner;

public class EquTriangleArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of triangle : ");
		double a = sc.nextDouble();
		double area = (Math.sqrt(3) / 4) * (a * a);
		System.out.println("Area of triangle is : " + area);
	}
}
