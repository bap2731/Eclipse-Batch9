package com.class03;

public class IfElse {

	public static void main(String[] args) {

		double num1 = 100.20;
		double num2 = 15.20;

		if (num1 > num2) {
			System.out.println("Double value " + num1 + " is larger than " + num2);

		} else if (num1 > num2) {

			System.out.println("Double value " + num2 + " is larger than " + num1);
		} else {
			System.out.println(num1 + num2);
		}
		System.out.println("----------------------------------------------");
		
		
		int day = 6;

		if (day == 1) {
			System.out.println("Today is Monday");

		} else if (day == 2) {
			System.out.println("Today is Tuesday");
		} else if (day == 3) {
			System.out.println("Today is Wednesday");
		} else if (day == 4) {
			System.out.println("Today is Thursday");
		} else if (day == 5) {
			System.out.println("Today is Friday");
		} else if (day == 6) {
			System.out.println("Today is Saturday");
		} else {
			System.out.println("Today is Sunday");

		}// control shift f puts it organize
		
		
		 int month = 12;
			        if (month == 1) {
			            System.out.println("jan");
			        }
			        else if ( month == 2) {
			            System.out.println("feb");
			        }
			        else if ( month == 3) {
			            System.out.println("marc");
			        }
			        else {
			            System.out.println("invalid month");
			        }
	}
}
