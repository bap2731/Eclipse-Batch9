package com.class02;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		name="Chris";
		char oneLetter= 'A';
		String greetings="Good Morning!";
		String phoneNumber="123-456-789";
		String stringNumber="12";
		String wordWithSpace=" ";
		
		System.out.println("Hello, my name is "+name);
		System.out.println("How are you "+name+"?");
		System.out.println(name+" is "+oneLetter+" student");
		
		String car="Tesla";
		int year=2021;
		
		System.out.println("I drive a "+year+" " +car);
		
		String computer="mackbook";
		int memory=250;
		
		System.out.println(name+" has a "+computer+" with "+memory+" GB memory");
		String combinedValue= year+" "+car;
		System.out.println(combinedValue);
		
		byte day=7;
		String month="February";
		String date=month+" "+day;
		System.out.println(date);
		
	}	

}
