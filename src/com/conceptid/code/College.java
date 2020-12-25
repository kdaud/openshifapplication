package com.conceptid.code;


public class College {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mycaller();
		System.out.println("Software Engineering");
		
		System.out.println("Hardware Components");
		sumValue();
	}
	
	private static void mycaller() {
		
		kakumirizi:
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				if (i == 3) {
					break kakumirizi;
				}
				System.out.print(" * ");
			}
			
			System.out.println();
			
		}
	}
	
	public static void sumValue() {
		int y = 42;
		int f = 45;
		System.out.println(Integer.sum(f, y));
		System.out.println(Integer.divideUnsigned(86, 4));
		System.out.println(Integer.reverse(58));
		

	}
	
}
