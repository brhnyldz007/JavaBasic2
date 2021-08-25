package com.neotech.lesson22;

public class PianoTeacher  extends Teacher{
	String PianoType;

	public PianoTeacher() {
		System.out.println("Default contructor for ChemistryTeacher class");
	}

	public PianoTeacher(String firstName, String lastName, String PianoType) {
		super(firstName, lastName);
		this.PianoType = PianoType;
	}
	
	void teachingPiano() {
		System.out.println("Teaching Piano...");
	}

}
