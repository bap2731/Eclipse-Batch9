package com.class08;

import java.util.Scanner;

public class TaskLoops {

	public static void main(String[] args) {
		//Create a program that will keep asking user to apply for a credit card
		//as soon you get "yes" from use program should stop asking
		
		Scanner scan=new Scanner(System.in);
		String answer;
		
		do {
			System.out.println("Please apply for a credit card");
			answer=scan.nextLine();
			
		} while(!answer.equalsIgnoreCase("yes"));
		System.out.println("Ok, no more questions");
		System.out.println("----------------------Another wAY");
		
		System.out.println("Please apply for a credit card");
		answer=scan.nextLine();
		while(!answer.equalsIgnoreCase("yes"));
			System.out.println("Please apply for a credit card");
			
		}
		
		
	}


