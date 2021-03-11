package com.class06;

public class NotOperators {

	public static void main(String[] args) {
		// 		!=opposite
		
		
		boolean rain=true;
		if(!rain) {
			System.out.println("i will go to the park");
		}
		boolean boo=!true;
		System.out.println(boo);
		boolean boo1=!false;
		System.out.println(boo1);
		
		boolean traffic=true;
		if(!traffic) {
			System.out.println("i will come on time");
		}
		String day="Friday";
		if(!day.equals("Friday")) {
			System.out.println("Today is not Friday");
		}
	}
	
	
	
	

}
