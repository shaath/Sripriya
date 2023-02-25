package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		boolean falg = false;
		ArrayList<String> arrlist = new ArrayList<>();
		
		arrlist.add("Boll");
		arrlist.add("Dog");
		arrlist.add("Apple");
		arrlist.add("Dog");
		arrlist.add(4, "Sripriya");
		arrlist.add("Dog");
		System.out.println(arrlist.size());
//		arrlist.clear();
//		System.out.println(arrlist.lastIndexOf("Dog"));
		arrlist.set(5, "Selenium");
//		arrlist.remove(3);
		arrlist.remove("Dog");
		System.out.println(arrlist.contains("Sripriya13513"));
//		arrlist.trimToSize();
		
		System.out.println(arrlist.size());
		
		arrlist.add("UFT");
		arrlist.add(6, "Manual");
		arrlist.trimToSize();
		
//		System.out.println(arrlist.get(2));
		for(int i = 0; i < arrlist.size(); i++){
			System.out.println(arrlist.get(i));
		}

	}

}
