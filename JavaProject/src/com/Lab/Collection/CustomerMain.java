package com.Lab.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Customer implements Comparable<Customer> {
	int c_id;
	String c_name;
	String c_city;

	public Customer(int c_id, String c_name, String c_city) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_city = c_city;
	}

	@Override
	public String toString() {
		return "Customer [c_id=" + c_id + ", c_name=" + c_name + ", c_city=" + c_city + "]";
	}

	@Override
	public int compareTo(Customer o) {

		return this.c_id - o.c_id;
	}

}

public class CustomerMain {

	public static void CustomSorting(HashMap<Customer, String> hm) {

		TreeMap<Customer, String> tm = new TreeMap<>(hm);

		for (Map.Entry<Customer, String> m : tm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

	public static void main(String[] args) {

		HashMap<Customer, String> hm = new HashMap<>();

		hm.put(new Customer(1, "Raj", "Mumbai"), "India");
		hm.put(new Customer(3, "Sujay", "Pune"), "India");
		hm.put(new Customer(2, "Allin", "Rome"), "Europe");
		hm.put(new Customer(5, "Stallin", "Paris"), "Europe");
		hm.put(new Customer(4, "Mike", "New-York"), "USA");

		CustomSorting(hm);

	}
}
