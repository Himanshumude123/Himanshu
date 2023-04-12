package com.OOPS;

import java.util.Scanner;

public class DisArium {

	public void checkNumber(int num) {
		int count = 0;
		int temp = num;

		while (num > 0) {
			count++;
			num = num / 10;
		}
		System.out.println(count);

		num = temp;

		int sum = 0;
		while (num > 0) {
			int digit = num % 10;

			int power = 1;

			for (int i = 1; i <= count; i++) {
				power = power * digit;
			}
			sum = sum + power;
			count--;
			num = num / 10;
		}
		System.out.println(sum);
		if (temp==sum) {
			System.out.println("The number is DisArium : " + sum);
		}else {
			System.out.println("its a not DisArium");
		}
	}
	
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int n = sc.nextInt();

		DisArium dis = new DisArium();
		dis.checkNumber(n);
	}
}
