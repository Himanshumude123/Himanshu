package com.ClassProgram;

//if we make a variable as a final then changing of its value is not allowed and if we make a class as a final then inheritance is not allowed;

public class FinalKeyword {

	 final int x = 100;
	final String str = "Think Quotient";

	public void show() {
		System.out.println(x);
		System.out.println(str);
	}

	// We can not Change the Value of Final Variable
//	public void change() {
//		x =500;
//		str = "T Q";
//	}

	final public void display(double y) {
		y = 50.28;
		System.out.println("This is a Final Method ");
		System.out.println(y);
	}

	public void callMethod() {
		this.display(58.25);

	}

	public static void main(String[] args) {

		FinalKeyword f = new FinalKeyword();
		f.show();
		f.callMethod();

	}

}
