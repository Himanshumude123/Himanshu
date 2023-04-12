package com.Dp_Basic_Test_3;

class Mobile {
	String memory = "128 GB";
}

class Apple extends Mobile {
	String camera = "13 px";
}

class Iphone extends Apple {
	String brand = "I-phone 14 pro";

	public void display() {
		System.out.println(" Brand :" + brand + "\n Camera :" + camera + "\n Memory :" + memory);
	}
}

public class Multileval_Inheritance_3 {

	public static void main(String[] args) {
		Iphone i = new Iphone();
		i.display();   

	}
}
