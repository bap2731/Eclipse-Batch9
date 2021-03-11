package Replit;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;
		double num1, num2,result;
		char operator;
		
	scan = new Scanner(System.in);
	System.out.println("Enter two numbers please");
	num1 = scan.nextDouble();
	num2 = scan.nextDouble();
	System.out.println("Enter your operator please");
	operator= scan.next().charAt(0);
	
	switch (operator) {
	case '+':
		result=num1+num2;
		break;
		
	case '-':
		result=num1-num2;
		break;
		
	case '*':
		result= num1*num2;
		break;
		
	case '/':
		result= num1/num2;
		break;
		default:
			result = 0;
		
			
	}
	System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	
	}

		
		
	}
	


