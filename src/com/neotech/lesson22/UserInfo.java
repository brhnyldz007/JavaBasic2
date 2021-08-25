package com.neotech.lesson22;

public class UserInfo extends UserClass {

	String address;
	
	UserInfo(){
		super.name = name;
		super.number = number;
		this.address = address;
	}
	
	public void UserDetails(){
		System.out.println(super.name + " " + super.number + " " +this.address );
	}
	public static void main(String[] args) {
		UserInfo str = new UserInfo();
		str.name = "Burhan";
		str.number = 23232;
		str.address = "california";
		str.UserDetails();
	}
}
