package com.Constructor;

import java.security.DomainCombiner;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		int num = 12345;
		int sum = 0;
		int count = 0;
		int reminder;

		while (num != 0) {
			reminder = num % 10;

			if (reminder % 2 != 0) {
				sum += reminder;
				count++;
				System.out.println(reminder);
			}
			num = num / 10;
		}
		System.out.println("Count of odd number are :" + count);
		System.out.println("Sum of odd number :" + sum);
	}
}
