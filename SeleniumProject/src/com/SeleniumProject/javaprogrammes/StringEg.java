package com.SeleniumProject.javaprogrammes;

public class StringEg {

	public static void main(String[] args) {
		String x = "Selenium";
		String y = "Trainee name is Sripriya";
		
		System.out.println(x.length());
		System.out.println(x.toUpperCase());
		System.out.println(x.toLowerCase());
		System.out.println(x.charAt(4));
		System.out.println(x.indexOf('e'));
		System.out.println(x.lastIndexOf('e'));
		
		System.out.println(x.equals("selenium"));
		System.out.println(x.equalsIgnoreCase("selenium"));
		
		System.out.println(x.contains("len"));
		
		System.out.println(x.startsWith("Sel"));
		System.out.println(x.endsWith("um"));

		System.out.println(x.isEmpty());
		
		System.out.println(x.substring(2, 5));
		
		System.out.println(x.replace('e', 'Z'));
		System.out.println(x.replaceFirst("e", "Z"));
		
		String[] split = y.split(" ");
//		System.out.println(split[3]);
		for (String string : split) {
			System.out.println(string);
		}
		
		
		System.out.println(x +" $$$$$$$$ "+ y);
		
		System.out.println(x.concat(y));
		System.out.println(x.join("^^^^^^^^^^^^^", x, y, "Jonnala"));
		
		
		
		
	}

}
