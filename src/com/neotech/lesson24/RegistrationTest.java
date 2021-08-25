package com.neotech.lesson24;

public class RegistrationTest {
	public static void main(String[] args) {

		Registration r = new Registration();
		
		System.out.println("____Email____");
		r.setEmail("burhan@hotmail.com");
		System.out.println(r.getEmail());
		
		
		r.setEmail("mila@yahoo.com");
		System.out.println(r.getEmail());
		
		System.out.println("___Username___");
		r.setUserName("Lillian");
		System.out.println(r.getUserName());
		
		r.setUserName("Yildiz");
		System.out.println(r.getUserName());
		
		
		System.out.println("___Password____");
		r.setPassword("31452");
		System.out.println(r.getPassword());
		
		r.setPassword("3242342");
		System.out.println(r.getPassword());
		
		r.setPassword("mILALILLIAN545");
		System.out.println(r.getPassword());
		
		
	}

}
