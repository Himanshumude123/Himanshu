package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenPosition {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(24);
		al.add(35);
		al.add(89);
		al.add(55);
		al.add(20);
		al.add(12);

		for (int i = 0; i < al.size(); i++) {

			if (i % 2 == 0) {
				System.out.println("Even Position Element :" + al.get(i));
			}
		}

		System.out.println("....................");

		Iterator<Integer> itr = al.iterator();

		while (itr.hasNext()) {

			Integer it = itr.next();

			if (it % 2 == 0) {
				System.out.println(it);

			}
		}
	}
}
