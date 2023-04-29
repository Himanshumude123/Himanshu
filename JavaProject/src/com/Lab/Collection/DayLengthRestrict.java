package com.Lab.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class DayLengthRestrict {

	public static void checkLength(ArrayList<String> al) {

		System.out.println("\n Day Whose Length Less Than 7 :");

		for (int i = 0; i < al.size(); i++) {

			String str = al.get(i);

			Iterator<String> itr = al.iterator();

			while (itr.hasNext()) {
				String n = itr.next();
				if (n.length() > 7) {
					itr.remove();
				}
			}
		}
		System.out.println(al);
	}

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thrusday");
		al.add("Friday");
		al.add("Saturday");
		al.add("Sunday");

		System.out.println(" Given Array List Elements :");
		System.out.println(al);

		checkLength(al);
	}
}
