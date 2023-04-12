package com.OOPS.assignments;

public class OneToAnotherObject {

	int age;
	String name;

	public OneToAnotherObject(int a, String n) {

		age = a;
		name = n;
	}

	public OneToAnotherObject(OneToAnotherObject o) {
		age = o.age;
		name = o.name;
	}

	public void display() {
		System.out.println(age + " " + name + " ");
	}

	public static void main(String[] args) {
		OneToAnotherObject o1 = new OneToAnotherObject(25, "Himanshu");
		OneToAnotherObject o2 = new OneToAnotherObject(o1);
		o1.display();
		o2.display();
	}
}
