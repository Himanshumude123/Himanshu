package com.StaticDemo;

public class StaticDemo2 {

	static {
		System.out.println("Static Block 2");
	}

	static {
		System.out.println("Static Block 1");
	}

	public static void main(String[] args) {
		
		System.out.println("Main method");
	}

}
