package com.class04;


public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean morning=true;
		boolean classToday=true;
		
		if(morning) {
			System.out.println("let me check if i have class today");
			
			if(classToday) {
				System.out.println("Good Morning my class mates");
				
				
			}else {
				System.out.println("Good Morning my Family");
			}
		}
		
		System.out.println("end of code");
		System.out.println("---------------------------------------------------------------------------------------");
		boolean anyAllergy=true;
		boolean pollenAllergy=true;
		if (anyAllergy) {
			System.out.println("lets check which allergies you have");
			if (pollenAllergy) {
				System.out.println("Do not get close to trees");
				
			}else {
				System.out.println("ok I know you do not have pollen allergy");
			}
			
		}else {
			System.out.println("You are lucky not having any allergies");
		}
			System.out.println("----------------------------------more examples-----------------------------");
		
			boolean isFriday=true;
			int day=13;
			
			if(isFriday) {
				System.out.println("Its a movie day!!!");
				if(day==13) {
					System.out.println("i will watch a scary movie");
					
				}else {
					System.out.println("I watch any available movie");
				}
				
			}else {
				System.out.println("i will stay at home and study in Java");
			}
			
			
	}

}
