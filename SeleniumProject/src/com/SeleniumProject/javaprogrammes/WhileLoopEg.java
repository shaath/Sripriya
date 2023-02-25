package com.SeleniumProject.javaprogrammes;

public class WhileLoopEg {

	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 500)
		{
			if(i == 251)
			{
				break;
			}
			System.out.println(i);

			i++;
		}
		
		System.out.println("*********");
		
		int j = 500;
		while(j >= 1)
		{
			System.out.println(j);
			j--;
		}

	}

}
