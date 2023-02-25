package com.SeleniumProject.javaprogrammes;

public class ObjectEg {

	public static void main(String[] args) {
		Object[] arrData = {4534346, "Selenium", 'M', 553443.52, true};
		
		System.out.println(arrData.length);
		
		for(Object obj: arrData)
		{
			System.out.println(obj);
		}

	}

}
