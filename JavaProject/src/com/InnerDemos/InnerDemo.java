package com.InnerDemos;

class Outer {
	int x = 100;

	class Inner {
		public void show() {
			System.out.println("X = " + x);
		}
	}
}

public class InnerDemo {

	public static void main(String[] args) {
		Outer o = new Outer();

		Outer.Inner in = o.new Inner();
		in.show();
	}
}
