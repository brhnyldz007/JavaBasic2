package com.neotech.lesson23;

public class ComputerTest {

	public static void main(String[] args) {

		Computer[] ms = { new Apple(), new Dell(), new HP(), new Lenova() };

		for (Computer ts : ms) {
			ts.memory();
		}
	}

}
