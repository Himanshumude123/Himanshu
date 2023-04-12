package com.Constructor;

public class Test {

	int id;
	String firstName;
	String lastName;
	
	public Test(){
		this(1, "Himanshu", "Mude");
		System.out.println("I am Parameterless");
	}
	
	public Test(int tid, String fname, String lname ) {
		//this();
		this.id=tid;
		this.firstName=fname;
		this.lastName=lname;
	}
	
	public void display() {
		System.out.println("\n Id :" + id + "\n First Name :" + firstName + "\n Last Name :" + lastName);
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.display();
	}
}
