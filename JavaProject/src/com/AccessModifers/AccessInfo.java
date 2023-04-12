package com.AccessModifers;

public class AccessInfo {

	
	public static void main(String[] args) {
		
		AccessModifer f = new AccessModifer();
		
		// System.out.println(f.x);
		
		System.out.println(f.city);
		f.doDefault();
		
		System.out.println(f.z);
		f.doProtected();
	}
}
