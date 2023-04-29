package com.Lab.Collection;

import java.util.*;

class Item {
	int item_id;
	String item_name;
	int item_price;

	public Item(int item_id, String item_name, int item_price) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.item_price = item_price;
	}

	@Override
	public String toString() {
		return "Item [item_id=" + item_id + ", item_name=" + item_name + ", item_price=" + item_price + "]";
	}

	public static void display(ArrayList<Item> al) {

		for (int i = 0; i < al.size(); i++) {
			Item i1 = al.get(i);
			for (int j = i + 1; j < al.size(); j++) {
				Item i2 = al.get(j);
				if (i1.item_price == i2.item_price) {
					System.out.println(i1.item_name);
					System.out.println(i2.item_name);
				}
			}
		}
	}

	public static void checkContains(ArrayList<Item> al) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Product Name Which is Available or not :");
		String str = sc.next();
		int count = 0;
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).item_name.contains(str)) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println("The Product is Available....!");
		} else {
			System.out.println("The Product is Not Available....!");
		}

		sc.close();

	}
}

public class ShowSameName {

	public static void main(String[] args) {

		ArrayList<Item> al = new ArrayList<Item>();

		al.add(new Item(1, "Soap", 50));
		al.add(new Item(2, "Shampoo", 120));
		al.add(new Item(3, "Detergent", 150));
		al.add(new Item(4, "HairOil", 120));

		for (Item i : al) {
			System.out.println(i);
		}

		Item.display(al);
		System.out.println();
		Item.checkContains(al);

	}
}
