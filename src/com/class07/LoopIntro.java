package com.class07;

public class LoopIntro {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("-----------------------------loops---------");
		
		int time =7; 

		if (time<12) { 
		System.out.println("Hello"); // code executes one time 
		System.out.println("--------------While loop-----------------");
		} 

		while (time<12) { 
			System.out.println("Hello"); // RUNS for ever
			time++;
	}
		System.out.println("-----------Print numbers from 1 to 10");
		
		int num=1;
		while(num<11) {
			System.out.println(num);
			num++;
		}
		System.out.println("-----------------print from 20 to 40---------");
		
		 num=20;
		while(num<=40) {
			System.out.print(num+" ");
			num++;
			
		}
		System.out.println();
		System.out.println("-----------Print 10 to 1 -------------");
		
		
		
		int a=10;
		while(a>=1) {
			System.out.print(a+" ");
			a--;
		
		
}
}
}
