package com.OOPS;

public class Overriding_Child extends Overriding_Parent{

	@Override
	public void Test(int x) {
		System.out.println(x);
	}
	
	
	public static void main(String[] args) {
		
		Overriding_Child o = new Overriding_Child();
		o.Test();
		o.Test(600);
	}
}
