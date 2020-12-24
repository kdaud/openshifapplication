package com.conceptid.code;

public class MathClass {
	
	public static void main(String[] args) {
		callerfunction();
	}
	
	public static void callerfunction() {
		Integer.bitCount(40);
		Integer.min(-9, -4);
		
		int [] numbr= {20,45,55,60,70,80};
		for (int a = 0; a < numbr.length; a++) {
			
			if (numbr[a] == 60) {
				continue;
			}
			System.out.println(numbr[a]);
		}
	
	
		for (int y = 16; y <= 20; y++)
		{
			if (y == 14) {
				break;
			}
			System.out.println("Code: " + y);
		}
	}
}
