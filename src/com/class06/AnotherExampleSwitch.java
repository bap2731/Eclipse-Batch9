package com.class06;

import java.util.Scanner;

public class AnotherExampleSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input;
		String country, food;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your country");
		
		country=input.nextLine();
		
		switch (country) {
		case"Usa":	
			food="burger";
			break;
		case "Afghanistan":
			food="Kebab";
			break;
		case "Vietnam":
			food="Pho";
			break;
		case "Poland":
			food="Pierogogi";
			break;
		case "Kazakstan":
			food="horse";
			break;
		case "Mexico":
			food="Tacos";
			break;
		default:
			food="unknown";
					
		}
		System.out.println(" Your favorite food is " +food);
	}

}
