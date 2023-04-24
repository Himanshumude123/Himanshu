package com.InnerDemos;

abstract class Printable {
	abstract public void print();
}

public class DemoAnnonymous1 {

	public static void main(String[] args) {

		Printable p = new Printable() {
			public void print() {
				System.out.println("This is Print Method...!!");
			}
		};
		p.print();
	}

}
