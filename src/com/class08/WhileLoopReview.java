package com.class08;

import java.util.Scanner;

public class WhileLoopReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we need to make user pay a soda keep asking user to pay until enter 3 dollars
		//if user gives more than 3 please use give less money'
		//if user gives less than 3 ask to give more
		
		Scanner input=new Scanner(System.in);
		int num;
		
do {
	System.out.println("Pay for your drink");
	num=input.nextInt();
	if (num <3) {
		System.out.println("Please pay more money");
	}else if (num>3) {
		System.out.println("Please pay less money");
	}
} while (num!=3);
System.out.println("Thanks, You are good to go");

System.out.println();
System.out.println("--------------------while--------------");

	
	}


}
				
			