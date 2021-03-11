package com.class07;

public class Tas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		while(num<=100) {
			System.out.print(num+" ");
			num++;
	}
		System.out.println();
		System.out.println("--------100 to 1------");
	
		int num1=100;
				while(num1>=1) {
					System.out.print(num1+" ");
					num1--;
				}
		
	System.out.println();
	System.out.println("-----Print even numbers");
	
	int e=20;
	while(e<=100) {
		System.out.print(e+" ");
		e+=2;
	}
		System.out.println();
		System.out.println("------------------");
		
		int a=20;
		while(a<=100) {
			if(a%2==0) {
			System.out.print(a+" ");
		}
			a++;
			}
		
}
}

