package com.arrayAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class Theatre {

	String theatreName;
	String theatreLocation;
	int[] noOfScreen;

	public Theatre(String theatreName, String theatreLocation, int[] noOfScreen) {

		this.theatreName = theatreName;
		this.theatreLocation = theatreLocation;
		this.noOfScreen = noOfScreen;
	}

	public String toString() {
		return " Theatre Name : " + theatreName + "\n Theatre Location : " + theatreLocation + "\n No Of Screen : "
				+ Arrays.toString(noOfScreen);
	}

	public static void main(String[] args) {

		Theatre th[] = new Theatre[4];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < th.length; i++) {

			System.out.println("Enter the Name of " + (i + 1) + " Theatre : ");
			String theatreName = sc.next();

			System.out.println("Enter the Location of " + (i + 1) + " Theatre :");
			String theatreLocation = sc.next();

			System.out.println("Enter the size of Screen :");
			int size = sc.nextInt();

			System.out.println("Enter the Number of " + (i + 1) + " Screen :");
			int noOFScreen[] = new int[size];

			for (int j = 0; j < noOFScreen.length; j++) {
				noOFScreen[j] = sc.nextInt();
			}

			th[i] = new Theatre(theatreName, theatreLocation, noOFScreen);
		}

		for (Theatre theatre : th) {
			System.out.println("...............");
			System.out.println(theatre);
		}

	}
}
