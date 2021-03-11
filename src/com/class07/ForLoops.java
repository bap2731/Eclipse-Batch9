package com.class07;

public class ForLoops {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {
			System.out.println("Hello");
		}
		System.out.println("-------------------1 to 50---------------");
		
		for( int i=1; i<=50; i++) {
			System.out.print(i+" ");
		
		}
		System.out.println();
		System.out.println("------------10 to 1-----------------");
		
		for (int i=10; i>=1; i--) {
			System.out.print(i+" ");
			
		}
		
		System.out.println();
		System.out.println("-----------what is my output------------"); // stars from 0 and than adds by 2	
		for(int a=0; a<=10; a+=2) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("-----------what is my output------------"); //adds by 10
		
		for(int i=5; i<=50; i+=10) {
			System.out.print(i+" ");
		}
	}
	

}
