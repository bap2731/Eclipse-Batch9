package com.class04;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean donate=true;
		int age, weight;
		age=18;
		weight=100;
		
		if (donate) {
			if(age>=18) {
				System.out.println("eligible to donate");
				if(weight>=110) {
					System.out.println("weight is eligible");
				}else {
					System.out.println("Weight not eligible");
				}
			}else {
				System.out.println("Not eligile to donate");
			}
			
				
		}else {
			System.out.println("Can't donate");
		}
	}
}
