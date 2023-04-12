package com.OOPS.Inheritance;

class Mobile {
	String memorySize = "128 GB";
}

class Apple extends Mobile {
	String camera = "18 pixle";
}

class Iphone extends Apple {
	String name = "I-Phone 14 pro Max";

	public void showDetails() {
		System.out.println(" Memory Size : " + memorySize + "\n Camera :" + camera + "\n Phone Name :" + name);
	}
}

public class MultiLevel {

	public static void main(String[] args) {

		Iphone i = new Iphone();
		i.showDetails();
	}
}
