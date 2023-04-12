package com.OOPS.Inheritance;

public class Area {

	public int calculateSquare(int a) {
		return a * a;
	}

	public static void main(String[] args) {

		Area a = new Area();
		System.out.println(a.calculateSquare(5));
	}
}
