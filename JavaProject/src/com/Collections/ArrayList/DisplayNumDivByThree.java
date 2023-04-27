package com.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class DisplayNumDivByThree {

	public static void display(ArrayList<Integer> al) {

		System.out.println("\n Whose number is divisible by 3 ");
		for (int i = 0; i < al.size(); i++) {
			Integer x = al.get(i);

			if (x % 3 == 0) {
				System.out.println(x);
			}
		}
	}

	public static void remove(ArrayList<Integer> al) {

		System.out.println("\n Whose elements are divisible by three are Removed ");

		Iterator<Integer> itr = al.iterator();

		while (itr.hasNext()) {
			int x = itr.next();

			if (x % 3 == 0) {
				itr.remove();
			}
		}
		System.out.println(al);
	}

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(1);
		al.add(2);
		al.add(3);
		al.add(5);
		al.add(7);
		al.add(6);
		al.add(9);
		al.add(8);
		al.add(12);
		al.add(15);

		System.out.println("Given array list Elements are : ");
		System.out.println(al);

		display(al);
		remove(al);
	}
}
