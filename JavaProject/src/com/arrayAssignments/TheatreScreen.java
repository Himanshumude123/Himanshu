package com.arrayAssignments;

class Movies {
	String m_name;
	double rating;

	public Movies(String m_name, double rating) {
		this.m_name = m_name;
		this.rating = rating;
	}

	public String toString() {
		return "Movie Name : " + m_name + "\n Rating of Movie : " + rating;
	}
}

public class TheatreScreen {

	int t_id;
	String t_name;
	Movies m;

	public TheatreScreen(int t_id, String t_name, Movies m) {
		this.t_id = t_id;
		this.t_name = t_name;
		this.m = m;
	}

	public String toString() {
		return " Theatre Id : " + t_id + "\n Theatre Name : " + t_name + "\n Movies :\n " + m;
	}

	public static void main(String[] args) {

		TheatreScreen ts = new TheatreScreen(1, "Sudama", new Movies("Pathan", 9.4));
		System.out.println(ts);

	}
}
