package com.OOPS.assignments;

public class RectangleArea {

	int length;
	int width;
	double Area;

	public void acceptDetails(int l, int w) {
		length = l;
		width = w;
	}

	public void calculateArea() {
		Area = length * width;
	}

	public void displayValue() {
		System.out.println(" Length :" + length + "\n Width :" + width + "\n Area :" + Area);
	}

	public static void main(String[] args) {
		RectangleArea r1 = new RectangleArea();
		r1.acceptDetails(20, 10);
		r1.calculateArea();
		r1.displayValue();

		System.out.println("_______________________________");
		
		RectangleArea r2 = new RectangleArea();
		r2.acceptDetails(50, 40);
		r2.calculateArea();
		r2.displayValue();
		
		
		// Annonimus object 
		/*
		 * int n=10; System.out.println(n+2);
		 * 
		 * System.out.println(10+2);
		 */
		
//		new RectangleArea().acceptDetails(10, 20);
		
		
	}
}
