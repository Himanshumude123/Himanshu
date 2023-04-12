package com.Arrays;

public class Remove {

	public void makeZero() {
		int search = 30;

		int x[] = { 10, 20, 30, 40, 30, 10, 30 };
		for (int i = 0; i < x.length; i++) {

			if (x[i] == search) {

				x[i] = 0;
			}
			System.out.print(" " + x[i]);
		}
	}

	public static void main(String[] args) {

		Remove r = new Remove();
		r.makeZero();
	}
}
