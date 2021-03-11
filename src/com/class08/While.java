package com.class08;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input=new Scanner(System.in);
		int money;
		System.out.println("please pay for the soda");
		money=input.nextInt();
		
		while(money!=3) {
			
			if (money <3) {
				System.out.println("Please pay more money");
			}else if (money>3) {
				System.out.println("Please pay less money");
		
		}
			money=input.nextInt();
			System.out.println("thank you for your purchase");
	}

}
}