package com.SeleniumProject.javaprogrammes;

public class MethodsEg {

	public static void main(String[] args) {
		
		Function1();
		String res = Function2();
		System.out.println(res);
		
		MethodsEg me = new MethodsEg();
		me.Function3();
		boolean flag = me.Function4();
		System.out.println(flag);
		
		int s = me.sum(40, 110);
		System.out.println(s);
	}
	
	//Static method without returning any value
	public static void Function1(){
		System.out.println("This is Function1 code");
	}
	
	//Static method with returning value
	public static String Function2(){
		System.out.println("This is Function2 code");
		return "Pass";
	}
	
	//Non Static Method without returning any value
	public void Function3(){
		System.out.println("This is Function3 code");
	}

	//Non Static Method with returning value
	public boolean Function4(){
		System.out.println("This is Function4 code");
		return true;
	}
	
	public int sum(int z, int b){
//		int a = 70;
//		int b = 30;
		
		int c = z + b;
		return c;
	}
	
	public int sum(int a, int b, int c){
		int d = a + b + c;
		return d;
	}
	
	public double sum(double a, double d){
		double e = a + d;
		return e;	
	}

}
