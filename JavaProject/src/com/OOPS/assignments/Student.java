package com.OOPS.assignments;

public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	
	public void acceptDetais() {
		
	}
	
	public void displayStudent(int id, String firstName, String lastName, String email) {
		System.out.println("Id :" + id);
		System.out.println("First Name :" + firstName);
		System.out.println("Last Name :" + lastName);
		System.out.println("Email :" + email);
		
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.displayStudent(1, "Himanshu", "Mude", "himanshumude26@gmail.com");
		
	}
}
