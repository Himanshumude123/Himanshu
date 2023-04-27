package com.Collections.ArrayList;

import java.util.ArrayList;

public class PrimeFromArrayList {

	public static void displayPrime(ArrayList<Integer> al) {

		for (int i = 0; i < al.get(i); i++) {
			int count = 0;
			Integer x = al.get(i);

			for (int j = 2; j < x; j++) {
				if (x % j == 0) {
					count++;
				}
			}

			if (count == 0) {
				System.out.println(x + " is a Prime number");
			}
		}

	}

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(2);
		al.add(3);
		al.add(4);
		al.add(7);
		al.add(12);
		al.add(5);
		al.add(9);
		al.add(8);

		System.out.println("Given Array List is : ");
		System.out.println(al);

		PrimeFromArrayList.displayPrime(al);

	}
}
