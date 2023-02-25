package com.SeleniumProject.javaprogrammes;

public class SwitchCaseEg {

	public static void main(String[] args) {
		String Course = "Selenium";
		
		switch(Course){
		case "Selenium":
			System.out.println("You are selected Selenium");
			break;
		case "UFT":
			System.out.println("You are selected UFT");
			break;
		case "DevOps":
			System.out.println("You are selected DevOps");
			break;
		default:
			System.out.println("Select a proper course");
			break;
		}

	}

}
