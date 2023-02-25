package com.SeleniumProject.javaprogrammes;

public class MethodsReueEg {

	public static void main(String[] args) {
		
		MethodsEg me = new MethodsEg();
		int res = me.sum(10, 90);
		System.out.println(res);
		
		me.Function1();
		
		res = me.sum(10, 50, 90);
		System.out.println(res);
		
		double d = me.sum(444.44, 46646.64);
		System.out.println(d);
	}

}
