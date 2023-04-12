package com.OOPS.Inheritance;

class Shape {
	int length;
	int breadth;

	public void run() {
		System.out.println("This program used to calculate the area using single inheritance ");
	}
}

class Rectangle extends Shape {

	public void calculateArea(int length, int breadth) {
		int area = length * breadth;
		System.out.println("Area of rectangle is = " + area);
	}
}

public class single {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		r.run();
		r.calculateArea(10, 5);
	}
}
