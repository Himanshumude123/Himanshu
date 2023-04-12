package com.Dp_Basic_Test_2;

public class Numbers_1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 5 != 0 && i % 10 != 0) {
				System.out.println(i);
			}
		}
	}
}
