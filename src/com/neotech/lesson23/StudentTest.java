package com.neotech.lesson23;

public class StudentTest {
	public static void main(String[] args) {
		
		Student ms = new NeoTechStudent();
		ms.talk();
		Student ks = new CollegeStudent();
		ks.talk();
		Student ts = new SchoolStudent();
		ts.talk();
		Student lk = new Student();
		lk.talk();
	}

}
