package com.Collections.Assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ColorsMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Red");
		hm.put(2, "Orange");
		hm.put(3, "Yellow");
		hm.put(4, "Green");
		hm.put(5, "Blue");
		hm.put(6, "Indigo");
		hm.put(7, "Voilet");

		System.out.println(hm);

		System.out.println("..............");

		for (Map.Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("...............");

		Set<Integer> s = hm.keySet();

		System.out.println(s);
		
		System.out.println("................");

		Iterator<Integer> itr = s.iterator();

		while (itr.hasNext()) {
			Integer str = itr.next();
			System.out.println(hm.get(str));
		}

	}
}
