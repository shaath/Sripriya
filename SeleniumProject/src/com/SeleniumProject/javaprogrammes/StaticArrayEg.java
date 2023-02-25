package com.SeleniumProject.javaprogrammes;

public class StaticArrayEg {

	public static void main(String[] args) {
		int[] arrSalary = {10000, 20000, 30000, 45000, 50000, 60000, 30000, 90000};

//		System.out.println(arrSalary[3]);
		int len = arrSalary.length;
		System.out.println(len);
		
		for (int i = 0; i < len; i++) 
		{
			System.out.println(arrSalary[i]);
		}
		
	}

}
