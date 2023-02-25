package com.SeleniumProject.javaprogrammes;

public class StringEg2 {

	public static void main(String[] args) {
		String x = "275 test cases passed out of 525 test cases";
		
		String[] split = x.split(" ");
		String passCount = split[0];
		String totalCount = split[6];
		
		System.out.println(passCount + "-------"  + totalCount);

		int p = Integer.parseInt(passCount);
		int t = Integer.parseInt(totalCount);
		
		int f = t - p;
		System.out.println(f);
		
	}

}
