package com.ClassProgram;

abstract class Fruit {
	abstract public void fruit();
}

abstract class Mango extends Fruit {
	abstract public void mango();
}

class Banana extends Mango {

	@Override
	public void fruit() {
		System.out.println("This is a fruit.....");

	}

	@Override
	public void mango() {
		System.out.println("This is a Mango......");

	}

}

public class AbstractClass {

	public static void main(String[] args) {
		Banana b = new Banana();
		b.fruit();
		b.mango();
	}

}
