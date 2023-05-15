package com.Lab.Collection;

import java.util.*;
import java.util.Map.Entry;

public class CustumMain {

	public static void sorting(HashMap<Integer, String> hm) {

		TreeMap<Integer, String> tm = new TreeMap<>(hm);

		for (Map.Entry<Integer, String> m : tm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(5, "Blue");
		hm.put(1, "Red");
		hm.put(3, "Yellow");
		hm.put(4, "Green");
		hm.put(2, "Orange");
		hm.put(6, "Indigo");
		hm.put(7, "Voilet");

		sorting(hm);
	}
}
