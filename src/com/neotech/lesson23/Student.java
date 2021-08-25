package com.neotech.lesson23;

public class Student {
	
	String name;
	String lastname;
	
	void Student(String name) {
		System.out.println(name);
		
	}
	
	void talk() {
		System.out.println("hey!");
	}
}	
class NeoTechStudent extends Student{
		
		void talk() {
			name = "burhan";
			System.out.println("hey2!" + name);
		}
		void eat() {
			System.out.println("iskender kebab");
		}
		
	}
class CollegeStudent extends Student{
		
		void talk() {
			lastname = "yildiz";
			System.out.println("hey3! burhan " + lastname);
		}
		void id() {
			System.out.println("1212312123");
		}
		
	}
class SchoolStudent extends Student {
		void talk() {
			name = "ivonne";
			lastname = "yildiz";
			System.out.println("hey4!" + name +" "+ lastname);
		}
		void card() {
			System.out.println("6767676");
		}
		
	}




