package com.Looping;

import java.util.Scanner;

public class Armstrong {

	public void checkArmstring(int num) {
		int sum = 0;
		int temp = num;

		while (num > 0) {
			int digit = num % 10;
			sum = sum + (digit * digit * digit);
			num = num / 10;
		}
		System.out.println(sum + " " + num);
		num=temp;
		
		if(num==sum) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int n = sc.nextInt();

		Armstrong arm = new Armstrong();
		arm.checkArmstring(n);
	}
}
