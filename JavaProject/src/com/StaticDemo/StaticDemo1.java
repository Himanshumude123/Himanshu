package com.StaticDemo;

public class StaticDemo1 {

	static {
		System.out.println("Static Block 1");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
	}
	
	static{
		System.out.println("Static Block 2");
	}
}
