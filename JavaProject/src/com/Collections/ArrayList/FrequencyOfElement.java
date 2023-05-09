package com.Collections.ArrayList;

import java.util.ArrayList;

public class FrequencyOfElement {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(1);
		al.add(2);
		al.add(4);
		al.add(2);
		al.add(6);
		al.add(1);
		al.add(7);
		al.add(4);

		for (int i = 0; i < al.size(); i++) {

			boolean visited = false;
			int count = 1;
			for (int j = i - 1; j >= 0; j--) {

				if (al.get(i) == al.get(j)) {
					visited = true;
					break;
				}
			}
			if (visited == false) {
				for (int k = i + 1; k < al.size(); k++) {
					if (al.get(i) == al.get(k)) {
						count++;
					}
				}
				System.out.println("Element is :" + al.get(i) + "--->" + "Count is :" + count);
			}
		}
	}
}
