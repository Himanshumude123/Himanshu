package com.AccessModifers;

public class AccessModifer {

	private int x=10;
	
	String city = "Pune";
	
	protected int z = 200;
	
	public String name = "Allice";
	
	
	
	private void doPrivate() {
		System.out.println("This is Private");
	}
	
	void doDefault() {
		System.out.println("This is Default");
	}
	
	protected void doProtected() {
		System.out.println("This is protcted");
	}
	
	public void doPublic() {
		System.out.println("This is Public");
	}
	
	
	public static void main(String[] args) {
		
		AccessModifer a = new AccessModifer();
		System.out.println(a.x);
		a.doPrivate();
		
		System.out.println(".............");
		
		System.out.println(a.city);
		a.doDefault();
		
		System.out.println(".............");
		
		System.out.println(a.z);
		a.doProtected();
		
		System.out.println(".............");
		
		System.out.println(a.name);
		a.doPublic();
	}
}
