package com.OOPS;

public class Customer {

	int cust_id;
	String cust_name;

	public Customer() {

		System.out.println("I am a Customer");

	}

	public Customer(int x) {
		System.out.println("X =" + x);
	}

	public Customer(int cust_id, String cust_name) {
		System.out.println("Customer id :" + cust_id);
		System.out.println("Customer Name :" + cust_name);
	}

	public static void main(String[] args) {
		Customer c1 = new Customer();
		Customer c2 = new Customer(10);
		Customer c3 = new Customer(1, "Harish");
	}
}
