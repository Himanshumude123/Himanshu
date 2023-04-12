package com.LabActivity;

public class Cycle {

	String brand_name;
	String color;
	int no_OfWheels;

	Cycle() {
		this("Hero", "Black", 2);
		System.out.println("I am a Default Constructor :");
	}

	public Cycle(int price, int speed) {
		this();
		System.out.println("Price of the Cycle :" + price);
		System.out.println("Speed of cycle in Km are :" + speed);
	}

	public Cycle(String b_name, String color, int wheels) {
		this.brand_name = b_name;
		this.color = color;
		this.no_OfWheels = wheels;
	}

	public void display() {
		System.out.println(" Brand Name :" + brand_name + "\n Color :" + color + "\n Wheels :" + no_OfWheels);
	}

	public static void main(String[] args) {
		Cycle c = new Cycle(25000, 20);
		c.display();
	}
}
