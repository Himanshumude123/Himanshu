package com.StringDemos.LabActivity;

public class SampleTask {

//	public static void showOutput(String str) {
//
//		String word[] = str.split(" ");
//		StringBuilder sb = new StringBuilder();
//		sb.append(word[0].toUpperCase().charAt(0)).append(".");
//		sb.append(word[1].toUpperCase().charAt(0)).append(".");
//		sb.append(word[word.length - 1].toUpperCase());
//
//		String output = sb.toString();
//
//		System.out.println(output);
//
//	}
//
//	public static void main(String[] args) {
//		String str = "Rahul kapil sharma";
//
//		showOutput(str);
//	}

	public static void main(String[] args) {
		String str = "Rahul kapil sharma";

		String word[] = str.split(" ");
		String first = word[0];
		String middle = word[word.length - 2].toUpperCase();
		String last = word[word.length - 1].toUpperCase();

		String output = first.charAt(0) + "." + middle.charAt(0) + "." + last;

		System.out.println(output);

	}
}
