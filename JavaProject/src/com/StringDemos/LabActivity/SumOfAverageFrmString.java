package com.StringDemos.LabActivity;

public class SumOfAverageFrmString {

	public static void findSumAndAvg(String str) {

		int sum = 0;
		int count = 0;
		int avg = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				int numericValue = Character.getNumericValue(ch);
				sum = sum + numericValue;
				count++;
			}
		}
		avg = sum / count;

		System.out.println("Average is : " + avg);

	}

	public static void main(String[] args) {

		String str = "Virat Score 98 runs";

		SumOfAverageFrmString.findSumAndAvg(str);
	}
}
