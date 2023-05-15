package com.Collections.Assignments;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveFrmLList {

	public static void removeDivBy3(LinkedHashMap<Integer, String> map) {

		Set<Entry<Integer, String>> ent = map.entrySet();

		for (Map.Entry<Integer, String> m : ent) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("............");

		Iterator<Entry<Integer, String>> itr = ent.iterator();

		while (itr.hasNext()) {
			Entry<Integer, String> str = itr.next();
			if (str.getKey() % 3 == 0) {
				itr.remove();
			}
		}
		for (Map.Entry<Integer, String> m : ent) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map.put(9, "Nine");
		map.put(10, "Ten");

		removeDivBy3(map);
	}
}
