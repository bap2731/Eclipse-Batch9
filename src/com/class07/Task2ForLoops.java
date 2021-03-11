package com.class07;

public class Task2ForLoops {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("---------------100 to 1--------");
		
		for(int i=100; i>=1; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("--------20 to 1 even numbers 2 ways");
		
		for(int i=0; i<=20; i+=2) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.println("--------20 to 50 odd numbers 2 ways");
		for(int i=20;i<=50; i++  ) {
			
			if(i% 2==1) {
			System.out.print(i+" ");
		}
			System.out.println();
			System.out.println("--------20 to 50 odd numbers 2 ways");
			
			for (int a=21; a<=50; a+=2) {
				System.out.print(a+" ");
			}
			
			System.out.println();
			System.out.println("-------what my output");
			int sum=0;
			for(int b=1;b<=5; b++) {
				sum=sum+b;
				System.out.println(sum+" ");
			}
			
			System.out.println();
			System.out.println("-------- out put------");
			
			int result=0;
			for(int c=2; c<10; c+=2) {
			result +=c;	
			}
			System.out.println(result);
		}
		
		
	}


}

