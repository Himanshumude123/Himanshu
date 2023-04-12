package com.LabActivity;

class VolumeCalculator {

	double radius;
	double height;

	int length;
	int breadth;
	int total_height;

	public double calculateVolume(double radius, double height) {

		this.radius = radius;
		this.height = height;

		double cylinder = 3.14 * radius * radius * height;
		return cylinder;

	}

	public int calculateVolume(int length, int breadth, int total_height) {

		this.length = length;
		this.breadth = breadth;
		this.total_height = total_height;

		int cuboid = length * breadth * total_height;
		return cuboid;
	}
}

public class TestOverload {

	public static void main(String[] args) {
		VolumeCalculator v = new VolumeCalculator();
		System.out.println(" Volume Of Cylinder :" + v.calculateVolume(14.23, 27.42));
		System.out.println(" Volume Of Cuboid :" + v.calculateVolume(8, 14, 22));
	}
}
