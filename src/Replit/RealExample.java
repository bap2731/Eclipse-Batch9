package Replit;

import java.util.Scanner;

public class RealExample {

	public static void main(String[] args) {
	
		String userName;
		String password;
		System.out.println("Please enter Username");
		Scanner scanner=new Scanner(System.in);
		userName=scanner.next();
		System.out.println("Please enter your password");
		password=scanner.next();
	
		double accountBalance=1000;
		double amountToTransfer;
		
		if(userName.equals("Salma")) {
			
			if(password.equals("Salma123")) {
				System.out.println("Welcome to bank of America");
				System.out.println("Please enter the amount to transfer");
				amountToTransfer=scanner.nextDouble();
				if(accountBalance>=amountToTransfer) {
					System.out.println("Amount transfred");
				
				}else {
					System.out.println("Insuficient balance");
				}
			}else {
				System.out.println("Incorrect password");
			
			}
		
			}else {
			System.out.println("username is not correct please try again");
		}
	}
	
	

}
