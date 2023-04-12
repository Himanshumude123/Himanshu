package com.OOPS;

public class Poly_Overloading {
	
	public void Test() {
		System.out.println("This Topic is Polymorphism OverLoading");
	}
	
	public void Test(int x, int y) {
		System.out.println(x);
		System.out.println(y);
	}
	
	public void Test(String name, float f, double d) {
		System.out.println(name);
		System.out.println(f);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		Poly_Overloading over = new Poly_Overloading();
		over.Test();
		over.Test(100, 200);
		over.Test("Anamika", 3.4f, 18.25d);
	}
	
	
}
