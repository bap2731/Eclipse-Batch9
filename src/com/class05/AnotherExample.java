package com.class05;

import java.util.Scanner;

public class AnotherExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we have to calculate commission based on the sale
		/*ask user to enter sale that he made based on sales
		 * If sale is 10 to 100---commission 10%
		 * If sale is 101 to 500--commission 20%
		 * If sale is 501 to 1000--commission 30%
		 * If more than 1000-- commission is 50%
	
		*/
		
		Scanner scan;
		double salesAmount, commission;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter daily sales amount");
		salesAmount=scan.nextDouble();
		
		if(salesAmount<10) {
			commission=0;
			
		}else if(salesAmount>=10 && salesAmount<=100) {
			commission=salesAmount*0.1;
			
		}else if(salesAmount>100 && salesAmount<=500) {
			commission=salesAmount*0.2;
				
		}else if(salesAmount>500 && salesAmount<=1000) {
			commission=salesAmount*0.3;
			
		}else {
			commission=salesAmount*0.5;
		}
		
		System.out.println("your daily commission is "+commission);
		//if commission if more than 500----you are great seller
		if (commission >500) {
			System.out.println("you ar great seller");
		}
	}

}
