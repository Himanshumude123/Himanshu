package com.LabActivity;

class Parent {
	Parent show() {
		System.out.println(" This is Parent Method ");
		return new Parent();
	}
}

class Child extends Parent {
	Child show() {
		super.show();
		System.out.println(" This is Child Method ");
		return new Child();
	}
}

public class Covariant {

	public static void main(String[] args) {
		Parent p = new Child();
		// Child p1 = p.show();
		 p.show();
		

	}
}
