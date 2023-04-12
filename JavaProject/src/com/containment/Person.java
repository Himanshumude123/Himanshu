package com.containment;

class Address {

	int pincode;
	String cityName;

	public Address(int pin, String city) {
		this.pincode = pin;
		this.cityName = city;
	}

	public String toString() {
		return " Pin Code :" + pincode + "\n City Name :" + cityName;
	}
}

public class Person {

	int personId;
	String personName;
	Address ad;

	public Person(int pid, String pname, Address ad) {
		this.personId = pid;
		this.personName = pname;
		this.ad = ad;
	}

	public String toString() {
		return " Person Id :" + personId + "\n Person Name :" + personName + "\n Address :" + ad;
	}

	public static void main(String[] args) {

		Person p = new Person(101, "Rakesh", new Address(442104, "Wardha"));
		System.out.println(p);
	}
}
