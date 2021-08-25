package com.neotech.lesson22;

public class TestTeacher {
public static void main(String[] args) {
		
		Teacher t = new Teacher("Hakan", "Kurhan");
		MathTeacher mt = new MathTeacher("Enes", "Safran", "Calculus");
		ChemistryTeacher ct = new ChemistryTeacher("Komron", "Baba", "Chemistry");
		PianoTeacher jt = new PianoTeacher("Mufasa", "Simsek","Fazioli");
	
		t.teaching();
		System.out.println("----------------");
		jt.teaching();
		jt.teachingPiano();
		System.out.println("----------------");
		ct.teaching();
		ct.teachingChemistry();
		System.out.println("----------------");
		mt.teaching();
		mt.teachingMath();
	}

}
