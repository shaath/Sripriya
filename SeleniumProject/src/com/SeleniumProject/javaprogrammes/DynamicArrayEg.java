package com.SeleniumProject.javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args) {
		Object[] x = new Object[5];

		System.out.println(x.length);
		
		x[1] = "Selenium";
		x[3] = true;
		x[1] = "UFT";
		
		for (Object object : x) {
			System.out.println(object);
		}
	}

}
