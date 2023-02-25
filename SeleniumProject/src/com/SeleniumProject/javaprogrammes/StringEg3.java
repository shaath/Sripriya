package com.SeleniumProject.javaprogrammes;


public class StringEg3 {

	public static void main(String[] args) {
		String s = "SriPriya is lear^&*ning J@#!ava";
		//OutPut : SPJ^&@#!ririyaislearningava
		
		String upper = s.replaceAll("[^A-Z]", "");
		String lower = s.replaceAll("[^a-z]", "");
		String special = s.replaceAll("[a-zA-Z]", "");
		
		System.out.println((upper+special+lower).replace(" ", ""));
		
		
	}
}
