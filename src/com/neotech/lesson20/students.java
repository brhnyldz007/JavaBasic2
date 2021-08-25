package com.neotech.lesson20;

public class students {

	String name;
	double grade1;
	double grade2;
	double grade3;
	
	students(int newgrade1,int newgrade2, int newgrade3,String newname){
		name = newname;
		grade1 = newgrade1;
		grade2 = newgrade2;
		grade3 = newgrade3;
		
		Average();
	}
	
	public void Average() {
		double average = (grade1+grade2+grade3)/3;
		System.out.println(name + " grade is  " +average);
		
	}
	
}
