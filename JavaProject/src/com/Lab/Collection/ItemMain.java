package com.Lab.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Supplier implements Comparable<Supplier> {
	int id;
	String name;
	Item1 i;

	public Supplier(int id, String name, Item1 i) {
		this.id = id;
		this.name = name;
		this.i = i;
	}

	@Override
	public String toString() {
		return "Supplier [id=" + id + ", name=" + name + ", i=" + i + "]";
	}

	@Override
	public int compareTo(Supplier o) {

		return o.i.name.compareTo(this.i.name);
	}

}

class Item1 implements Comparable<Item1> {
	int id;
	String name;
	Float price;

	public Item1(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Item1 o) {

		// return (int) (o.price - this.price);

		if (this.price == o.price) {
			return this.name.compareTo(o.name);
		} else {
			return o.price.compareTo(this.price);
		}
	}

}

public class ItemMain {

	public static void main(String[] args) {

		ArrayList<Item1> al = new ArrayList<Item1>();

		al.add(new Item1(1, "Soap", 50));
		al.add(new Item1(2, "Milk", 40));
		al.add(new Item1(3, "Oil", 100));
		al.add(new Item1(4, "Detergent", 50));

		for (Item1 i : al) {
			System.out.println(i);
		}

		System.out.println("...........");

		Collections.sort(al);

		for (Item1 i : al) {
			System.out.println(i);
		}

		System.out.println("..........");

		Collections.sort(al, new sortByName());

		for (Item1 i : al) {
			System.out.println(i);
		}

		System.out.println("\n Suppliers List...!");
		System.out.println();

		ArrayList<Supplier> sup = new ArrayList<>();

		sup.add(new Supplier(101, "Raman Store", new Item1(5, "HairOil", 35)));
		sup.add(new Supplier(102, "Suman General Store", new Item1(6, "Body Lotion", 350)));
		sup.add(new Supplier(103, "D - Mart", new Item1(7, "Lays", 120)));
		sup.add(new Supplier(104, "Trillium Mall", new Item1(8, "Beauty Cream", 675)));

		for (Supplier s : sup) {
			System.out.println(s);
		}

		System.out.println(".....Supplier sorting....");
		System.out.println();
		Collections.sort(sup);

		for (Supplier s : sup) {
			System.out.println(s);
		}
	}

}

class sortByName implements Comparator<Item1> {

	@Override
	public int compare(Item1 o1, Item1 o2) {

		return o1.name.compareTo(o2.name);
	}

}
