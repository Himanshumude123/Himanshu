package com.Dp_Basic_Test_3;

public class LoanCalculator {

	public static double calculateLoan(double principal, double rate) {
		// Housing loan calculation
		double loan = principal * (100 + rate);
		return loan;
	}

	public static double calculateLoan(double principal, double value1, double value2) {
		// Commercial loan calculation
		double loan = principal * (value1 + value2 + 100);
		return loan;
	}

	public static void main(String[] args) {

		double principal = 1000;
		double rate = 5;
		double loan = calculateLoan(principal, rate);
		System.out.println("Housing loan amount: " + loan);

		double value1 = 10;
		double value2 = 20;
		loan = calculateLoan(principal, value1, value2);
		System.out.println("Commercial loan amount: " + loan);
	}
}
