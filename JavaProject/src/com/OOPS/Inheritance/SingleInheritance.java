package com.OOPS.Inheritance;

class Animal {
	String foodType;

	public void run() {
		System.out.println("Animal Is Running..........");
	}
}

class Dog extends Animal {

	public void showFood() {
		foodType = "DogFood";
		System.out.println(foodType);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.run();
		d.showFood();

	}
}
