package com.class08;

import java.util.Scanner;

public class TaskWithLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String item;
		int price;
		int money;
		int remainder;
		int sum = 0;
		
		System.out.println("Please Enter an item you would like to buy");
		item=scan.nextLine();
		
		System.out.println("Please enter the price "+item);
		price=scan.nextInt();
		
		
			do {
				System.out.println("Please pay for "+item);
				money=scan.nextInt();
				sum+=money;
				if(sum<price) {
					
					remainder=price-sum;
					
					System.out.println("please give  "+remainder);
				}else if(sum>price) {
						remainder=sum-price;
						
						System.out.println("here is your change "+remainder);
						break;
				}else
					System.out.println("Yout got the right amount");
				
			}while(price!=sum);
			System.out.println("Thank you for shopping");
			
				
		}
	}



