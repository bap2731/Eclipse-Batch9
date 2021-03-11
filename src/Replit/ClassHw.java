package Replit;

import java.util.Scanner;

public class ClassHw {

	
	public static void main(String[] args) {
			// Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
	Scanner input = new Scanner(System.in);
	double firstNum, secondNum,  result;
	result = 0;
	String operator;
	System.out.println("Enter the first number");
	firstNum = input.nextDouble();
	System.out.println("Enter the operator");
	operator = input.next();
	System.out.println("Enter the second number");
	secondNum = input.nextDouble();
	if (operator.equals("+")) {
		result=firstNum+secondNum;
	}else if (operator.equals("-")) {
		result=firstNum-secondNum;
	}else if (operator.equals("/")) {
			result=firstNum/secondNum;
	}else if (operator.equals("*")) {
			result=firstNum*secondNum;
	}	
			
	System.out.println(" Based on the input you provide " +  result );
			
		
		
	}

}

