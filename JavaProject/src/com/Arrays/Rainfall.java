package com.Arrays;

import java.util.Scanner;

public class Rainfall {

	public void averageRainfall(float[] a) {

		System.out.println("To calculate average of Rainfall :");

		float sum = 0.0f;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
		System.out.println(" Total Rainfall in week : " + sum);
		float avg = sum / 7;
		System.out.println("Average of Rainfall : " + avg);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");

		int size = sc.nextInt();
		float arr[] = new float[size];
		System.out.println("Enter the Elements for Array");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextFloat();
		}

		Rainfall r = new Rainfall();
		r.averageRainfall(arr);
	}
}
