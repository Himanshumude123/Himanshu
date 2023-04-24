package com.Exceptions;

public class UseFinally {

	public static void main(String[] args) {
		try {
			System.out.println("Exceptions Handling...!");
			int x = 10;
			int ans = x / 0;

			System.out.println(ans);
		} finally {
			System.out.println("Finally Block...!");
		}

	}
}
