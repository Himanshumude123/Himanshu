package com.LabActivity;

class Parent1 {
	Object show() {
		System.out.println("This is Object class Covarient ");
		return this;
	}
}

class Child1 extends Parent1 {
	String show() {
		String str = "Hello World";
		return str;
	}
}

public class Covariant_1 {
	public static void main(String[] args) {
		Parent1 p1 = new Child1();
		System.out.println(p1.show());
	}
}
