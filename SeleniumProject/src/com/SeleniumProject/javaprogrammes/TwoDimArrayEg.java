package com.SeleniumProject.javaprogrammes;

public class TwoDimArrayEg {

	public static void main(String[] args) {
		Object[][] twoDimArray = new Object[2][3];
		
		System.out.println(twoDimArray.length);
		System.out.println(twoDimArray[1].length);
		
		twoDimArray[0][1] = "SriPriya";
		twoDimArray[1][0] = true;
		
		for (int i = 0; i < twoDimArray.length; i++)
		{
			for (int j = 0; j < twoDimArray[i].length; j++) {
				System.out.println(twoDimArray[i][j]);
			}
		}
	}

}
