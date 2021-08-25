package com.neotech.lesson20;

public class HomeWork3Demo {
	
	public static void main(String[] args) {
		HomeWork3 str = new HomeWork3();
		//public
		str.displayInfo();
	//	HomeWork3 str1 = new HomeWork3("Burhan","California/LaMesa","Yildiz");
		//private
		//str1.displayInfo();
		
		HomeWork3 str2 = new HomeWork3("Burhan","California/La Mesa", 90);
		//protected
		//I am sorry for being lazy not to write a meaningful display
		str2.displayInfo1();
		
		//we cannat use private contructor out of class
	}

}
