package com.StringDemos;

public class CountWords {

	public static void main(String[] args) {

		String str = "India Is My Country";

		int count = 0;
		for (String word : str.split(" ")) {
			count++;
			System.out.println(word);
		}
		System.out.println("Count of words are : " + count);
	}
}
