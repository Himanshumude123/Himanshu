package com.Lab.Collection;

import java.util.ArrayList;

public class Unique {

	public static void displayUnique(ArrayList<String> a1, ArrayList<String> a2) {

		ArrayList<String> a3 = new ArrayList<String>();

		for (int i = 0; i < a1.size(); i++) {
			boolean visited = false;

			for (int j = 0; j < a2.size(); j++) {
				if (a1.get(i) == a2.get(j)) {
					visited = true;
					break;
				}
			}
			if (visited != true) {
				// a3.add(a1.get(i) + " , " + a2.get(i) + " ");
				a3.add(a1.get(i));
				a3.add(a2.get(i));
			}
		}

		System.out.println("\n Unique Elements");
		System.out.println(a3);
	}

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();

		a1.add("Mango");
		a1.add("Apple");
		a1.add("Kiwi");
		a1.add("PineApple");

		System.out.println(" First Array List Elements : ");
		System.out.println(a1);

		ArrayList<String> a2 = new ArrayList<String>();

		a2.add("Mango");
		a2.add("Banana");
		a2.add("Kiwi");
		a2.add("WaterMelon");

		System.out.println("\n Second Array List Elements : ");
		System.out.println(a2);

		displayUnique(a1, a2);
	}
}
