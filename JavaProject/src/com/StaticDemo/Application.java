package com.StaticDemo;

public class Application {

	static int x = 10;
	int y = 20;

	public void show() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void display() {
		System.out.println(x);

		Application app = new Application();

		System.out.println(app.y);
	}

	public static void main(String[] args) {

		Application app1 = new Application();
		app1.show();

		System.out.println(".................");

		app1.display();
	}
}
