package com.neotech.lesson25;

public class Employee {
	String name;
	int salary;

	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return this.salary;
	}

	void highestSalary() {
		int highest = 0;

		for (Integer salary : values) {
			if (salary > highest) {
				highest = salary;
			}
		}

	}

}
