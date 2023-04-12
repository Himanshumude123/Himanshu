package com.ClassProgram;

interface Mobile {

	public void brand();
}

abstract class Iphone implements Mobile {

	abstract public void price();
}

class Android extends Iphone {

	@Override
	public void brand() {
		System.out.println(" This is brand class of Phones....");

	}

	@Override
	public void price() {
		System.out.println(" Price for Iphone is 129000 " + "\n Price for Android is 50000 ");

	}

}

public class InterfaceTask {

	public static void main(String[] args) {

		Android a = new Android();
		a.brand();
		a.price();
	}
}
