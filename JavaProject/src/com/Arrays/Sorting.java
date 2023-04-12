package com.Arrays;

import java.util.Arrays;

public class Sorting {

	public void sort(int[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int x : a) {
			System.out.println(x);
		}
		System.out.println("By Using Inbuild method............!");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {

		int arr[] = { 7, 6, 12, 4, 15 };

		Sorting s = new Sorting();
		s.sort(arr);

	}
}
