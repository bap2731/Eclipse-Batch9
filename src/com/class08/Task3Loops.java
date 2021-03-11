package com.class08;

import java.util.Scanner;

public class Task3Loops {

	public static void main(String[] args) {
		//Write a program that read a range of integers (start and end point)
		// provided by a user and then that range prints the sum of the even and of integers.
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter start number");
		int start =input.nextInt();
		System.out.println("please enter end number");
		int end =input.nextInt();
		
		int sumOdd=0;
		int sumEven=0;
		
		
		if(start<end) {
		for(int i=start; i<=end; i++) {
			if(i % 2!=0) {
				sumOdd+=i;		
			}else
				sumEven+=i;	
		}
		System.out.println("Sum of Odd # is "+sumOdd);
		System.out.println("Sum of Even # is "+sumEven);
		
	}
	

}
}
