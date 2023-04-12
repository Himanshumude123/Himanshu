package com.basic;

import com.AccessModifers.AccessModifer;

public class NewAccessInfo extends AccessModifer {

	
	public static void main(String[] args) {
		
		AccessModifer a = new AccessModifer();
		
		System.out.println(a.name);
		a.doPublic();
		
		NewAccessInfo n = new NewAccessInfo();
		System.out.println(n.z);
		n.doProtected();
		
		System.out.println(n.name);
		n.doPublic();
	}
}
