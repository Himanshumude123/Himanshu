package com.ClassProgram;

interface Operation {
	int x = 10;

	public void variable();
}

abstract class Arithmatic implements Operation {
	int y = 20;

	public abstract void variable();
}

class Child extends Arithmatic {

	@Override
	public void variable() {
		int z = x + y;
		System.out.println("Addition of Two variable is :" + z);
	}

}

public class InterfaceDemo {

	public static void main(String[] args) {
		Operation o = new Child();
		o.variable();
	}
}
