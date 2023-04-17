package com.arrayAssignments;

public class Movie {

	int id;
	String name;
	double rating;

	public Movie(int id, String name, double rating) {
		// super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}

	public static void main(String[] args) {

		Movie m = new Movie(1, "KGF", 8.8);
		Movie m1 = new Movie(2, "RRR", 9.8);
		Movie m2 = new Movie(3, "Pathan", 9.2);

		System.out.println(m);
		System.out.println(m1);
		System.out.println(m2);
	}

}
