package com.SeleniumProject.javaprogrammes;

import java.util.HashMap;
import java.util.Map;

public class HashmapEg {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(10, "Selenium");
		map.put(20, "SriPriya");
		map.put(30, "UFT");
		map.put(40, "Apple");
		map.put(30, "Sharat");
		
//		System.out.println(map.get(30));
//		map.replace(30, "DevOps");
		Object hm = map.clone();
		System.out.println(hm);
		
		System.out.println("***************************");
		
		for(Map.Entry m : map.entrySet()){
//			System.out.println(m.getKey());
			System.out.println(m.getValue());
			
//			System.out.println(map.get(m.getKey()));
		}	
	}

}
