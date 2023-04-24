package com.InnerDemos;

class OuterDemo {
	int id = 101;
	String firstName = "Himanshu";
	String lastName = "Mude";

	class Inner {
		public void show() {
			System.out.println("ID -> " + id);
			System.out.println("First Name -> " + firstName);
			System.out.println("Last Name -> " + lastName);
		}
	}
}

public class InnerDemo1 {

	public static void main(String[] args) {

		OuterDemo o = new OuterDemo();

		OuterDemo.Inner in = o.new Inner();
		in.show();
	}
}
