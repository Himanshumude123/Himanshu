package com.Collections.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Order {
	int o_id;
	String o_date;
	String Courier_name;

	public Order(int o_id, String o_date, String courier_name) {
		this.o_id = o_id;
		this.o_date = o_date;
		Courier_name = courier_name;
	}

	@Override
	public String toString() {
		return "Order [o_id=" + o_id + ", o_date=" + o_date + ", Courier_name=" + Courier_name + "]";
	}

}

class Customer implements Comparable<Customer> {

	int c_id;
	String c_name;
	String c_city;
	Order o;

	public Customer(int c_id, String c_name, String c_city, Order o) {
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_city = c_city;
		this.o = o;
	}

	@Override
	public String toString() {
		return "Customer [c_id=" + c_id + ", c_name=" + c_name + ", c_city=" + c_city + ", o=" + o + "]";
	}

	@Override
	public int compareTo(Customer o) {

		return this.o.o_date.compareTo(o.o.o_date);
	}
}

public class CustomerMain {

	public static void main(String[] args) {

		ArrayList<Customer> al = new ArrayList<Customer>();

		al.add(new Customer(1, "Mrx", "Mumbai", new Order(101, "2000-09-12", "Fed-ex")));
		al.add(new Customer(2, "Mry", "Mumbai", new Order(102, "2005-07-15", "Fed-ex")));
		al.add(new Customer(3, "Mrz", "Nagpur", new Order(103, "2003-05-20", "Blue-Dart")));
		al.add(new Customer(4, "Mrh", "Pune", new Order(104, "2002-02-25", "Fed-ex")));

		for (Customer c : al) {
			System.out.println(c);
		}

		System.out.println("..........Sort By Order Date In Assending..........");

		Collections.sort(al);

		for (Customer c : al) {
			System.out.println(c);
		}

		System.out.println("..........Sort By Order Date In Descending..........");

		Collections.sort(al, new sortByDesc());

		for (Customer c : al) {
			System.out.println(c);
		}
	}
}

class sortByDesc implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {

		return o2.o.o_date.compareTo(o1.o.o_date);
	}

}
