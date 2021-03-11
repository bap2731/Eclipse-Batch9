package com.class07;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
// play lottery and winning number is 17, we need to keep asking any number 1 to 100 until its right
		Scanner input;
		int num;
		int lotteryNumber=17;
		input=new Scanner(System.in);
		
		do {
			System.out.println("Please enter any number from 1 to 100 to win");
			num=input.nextInt();
		}while(num!=lotteryNumber);
		
		System.out.println("congratulations you entered "+num+" which is a lucky#");
		
		
		
		
		
		
		
	
	
	
	
	}
}