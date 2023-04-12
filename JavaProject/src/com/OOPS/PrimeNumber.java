package com.OOPS;

public class PrimeNumber {

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
 
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		for (int i = 2; i <= 10; i++) {
			if (isPrime(i)) {
				sum += i;
				count++;
			}
		}
		double avg = (double) sum / count;
		System.out.println("Average of prime numbers between 1 to 10: " + avg);
	}

}
