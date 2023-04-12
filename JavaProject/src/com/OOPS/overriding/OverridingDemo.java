package com.OOPS.overriding;

class Birds {

	public void fly() {
		System.out.println("There are several type of birds....");
	}
}
class Sparrow extends Birds {

	@Override
	public void fly() {
		System.out.println("Sparrow is a little and cute bird.... ");
	}
}
class Parrot extends Birds {

	@Override
	public void fly() {
		System.out.println("Parrot is Basically green in color and parrot eats Chilli....");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {

		Birds b = new Parrot();
		b.fly();
	}

}
