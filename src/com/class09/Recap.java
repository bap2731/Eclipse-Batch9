package com.class09;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<4; i++) {
			for (int j=1; j<5; j++) {
				System.out.println("Good evening");
			}
			System.out.println("------------------");
		}
		System.out.println("-----------------------------------------");
		
		for(int i=1; i<3; i++) {
			System.out.println("Outer loop");
			for(int j=1; j<=4; j++) {
				System.out.println(i+" "+j);
				
			}
		}
		System.out.println("---------Print numbers from 10 to 99 nested loops");
		for(int i=1; i<10; i++) {
			for(int j=0; j<=9; j++) {
				System.out.println(i+" "+j);
			}
			
			
		}
	}

}
