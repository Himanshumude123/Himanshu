package com.Collections.Assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class PizzaPan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// if char is already present the count + 1
			
			if (hm.containsKey(ch)) {
				int count = hm.get(ch);
				count = count + 1;
				hm.put(ch, count );
			} else {       
				// else count = 1
				hm.put(ch, 1);
			}
		}

		Set<Entry<Character, Integer>> entry = hm.entrySet();

		for (Map.Entry<Character, Integer> m : entry) {
			System.out.println("Keys : " + m.getKey() + "-->" + "Value : " + m.getValue());
		}

	}
}
