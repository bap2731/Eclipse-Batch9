package com.class06;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double num1, num2, num3, largest;
		System.out.println("Enter 3 number");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();
		
		if(num1 > num2 && num1 > num3) {
			largest = num1;
		}else if(num2 > num1 && num2 > num3) {
			largest = num2;
		}else {
			largest = num3;
		}
		System.out.println("The largest number is " + largest );
		
		System.out.println("======================");
		/*
		 * Write a program to find largest number among three numbers using nested if provided by
a user (numbers must be distinct)
		 */
		
		if(num1>num2) {
			if(num1>num3) {
				largest = num1;
			}
		}else if(num2>num1) {
			if(num2>num3) {
				largest = num2;
			}
		}else {
			largest = num3;
		}
		System.out.println("The largest number is " + largest);
	}

}
