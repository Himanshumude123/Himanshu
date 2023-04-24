package com.InnerDemos;

interface Fruit {
	public void test();
}

public class DemoAnnonymous {

	public static void main(String[] args) {

		Fruit f = new Fruit() {
			public void test() {
				System.out.println("Eating fruits make yourself Healthy.....!!!");
			}
		};

		f.test();
	}
}
