package com.class05;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String day="Sunday";
		
		if(day.equals("Monday")	|| day.equals("Friday")) {
			System.out.println("Today i have no class");
		}else if (day.equals("Tuesday")   || day.equals("Wednesday")) {
			System.out.println("today i have Manual class");
		}else if( day.equals("Thrusday")  || day.equals("Friday")) {
			System.out.println("I have review class");
		
		}else if(day.equals("Saturday")   || day.equals("Sunday")) {
			System.out.println("I have Java class");
		}else {
			System.out.println(day+" is invalid");
		}
	}

}
