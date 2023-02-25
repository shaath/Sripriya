package com.SeleniumProject.javaprogrammes;

public class InterfaceResuseEg {

	public static void main(String[] args) {
		InterfaceImplementsEg1 if1 = new InterfaceImplementsEg1();
		if1.ship();

		InterfaceImplementsEg2 if2 = new InterfaceImplementsEg2();
		if2.ship();
		
		InterfaceEg ie = new InterfaceImplementsEg1();
		ie.bike();
		
	}

}
