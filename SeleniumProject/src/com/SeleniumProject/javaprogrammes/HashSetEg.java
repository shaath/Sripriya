package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEg {

	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<>();
		
		hs.add("Boll");
		hs.add("Elephant");
		hs.add("Apple");
		hs.add("Cat");
		hs.add("Apple");
		
//		System.out.println(hs.size());
		
//		Iterator<Object> it = hs.iterator();
//		
//		while(it.hasNext()){
//			Object data = it.next();
//			System.out.println(data);
//		}
		hs.remove("Apple");
		
		for(Object obj: hs){
			System.out.println(obj);
		}
	}

}
