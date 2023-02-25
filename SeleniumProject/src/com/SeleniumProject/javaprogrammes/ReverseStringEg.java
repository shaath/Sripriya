package com.SeleniumProject.javaprogrammes;

public class ReverseStringEg {

	public static void main(String[] args) {
		
		String x = "malayalam";
		String y = "";
		int len = x.length();
		
		for(int i = len-1; i >= 0; i--){
//			System.out.print(x.charAt(i));
			y = y + x.charAt(i);
		}
		System.out.println(y);
		if (x.equalsIgnoreCase(y)) {
			System.out.println("Given String is a polyndrome");
		}else{
			System.out.println("Given String is not a polyndrome");
		}
	}

}
