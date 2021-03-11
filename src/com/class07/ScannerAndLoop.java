package com.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		
		Scanner scan;
		String name;
		scan=new Scanner(System.in);
		
		
		int q=5;
		while(q>=1) { //change to 10 so it wont be infinite
			System.out.println("Please enter your name");
			
			name=scan.nextLine();
			System.out.println("Hello "+name);
			q--;

		}
		
		
	}
	
	}


