package com.class04;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rate=4.6;
		double price=19000;
		
		if (rate>4.5) {
			System.out.println("will not buy a house");
			
		}else {
			System.out.println("will consider buying");
			if(price>20000) {
				System.out.println("i need a loan");
			}else {
				System.out.println("i will pay cash");
			}
		}
	}

}
