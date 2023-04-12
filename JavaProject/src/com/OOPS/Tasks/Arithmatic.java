package com.OOPS.Tasks;

public class Arithmatic {

	public void Addition (int x , int y) {
		System.out.println(x+y);
	}
	
	public void substraction(double d , int b) {
		System.out.println(d-b);
	}
	
	public void multiply(int c , double d) {
		System.out.println(c*d);
	}
	
	public void dividation(double s , double z) {
		System.out.println(s/z);
	}
	
	
	public static void main(String[] args) {
		
		Arithmatic ari = new Arithmatic();
		
		ari.Addition(10, 5);
		ari.substraction(19.5, 8);
		ari.multiply(7, 18.5);
		ari.dividation(8.2, 100.6);
	}
}
