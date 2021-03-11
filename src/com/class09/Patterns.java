package com.class09;

public class Patterns {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			System.out.println("*");
			
		}
			System.out.println("--------------------------");
		for (int r=1; r<=4; r++) {
			for(int c=1; c<=5; c++) {
				System.out.print("*");	
			}
				System.out.println();	
			}
		
			System.out.println("---------------");
		for(int r1=1; r1<=6; r1++) {
			for(int c1=1; c1<=8; c1++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		System.out.println("--------------------Number square---------");
		for(int r2=1; r2<=4; r2++) {
			for(int c2=1; c2<=5; c2++) {
				System.out.print(c2+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("---------reverse numbers");
		for(int r3=1; r3<=5; r3++) {
			for(int c3=6; c3>=1; c3--){
				System.out.print(c3+ " ");
				}
			System.out.println();
		}
		
		System.out.println("-------------odd numbers------");
		for(int r4=1; r4<=5; r4++) {
			for(int c4=6; c4>=1; c4--){
				System.out.print(r4+ " ");
				}
			System.out.println();
		}
		System.out.println("-----------even numbers-------");
		for(int r5=1; r5<=5; r5++) {
			for(int c5=5; c5>=1; c5--){
				System.out.print(r5+r5);
				}
			System.out.println();	
		
		
	}
}
}



