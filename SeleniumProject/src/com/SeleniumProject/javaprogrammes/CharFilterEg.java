package com.SeleniumProject.javaprogrammes;

public class CharFilterEg {

	public static void main(String[] args) {
		
		String s = "SriPriya is lear^&*ning J@#!ava";
				 //SPJ^&@#!ririyaislearningava
		String x = s.replace(" ", "");
		String upper = "";
		String lower = "";
		String sripriya = "";
		
		char[] ch = x.toCharArray();
		
		for (char c : ch) {
//			System.out.println(c);
			if (Character.isUpperCase(c)) 
			{
				upper = upper + c;
			}
			else if (Character.isLowerCase(c)) {
				lower = lower + c;
			}
			else
			{
				sripriya = sripriya + c;
			}
		}
		System.out.println(upper + sripriya + lower);
		

	}

}
