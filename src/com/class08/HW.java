package com.class08;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sum of ODD AND EVEN NUMBERS
		
		
		int odd = 0;
		int even = 0;
		
		for (int i =0; i<=50; i++) {
			if(i%2==0) {
				even=even+i;
			}else {
				odd=odd+i;
			}
		}
		
		System.out.println("Sum of odd numbers equal to " + odd);
		System.out.println("Sum of even numbers equal to " +even);
	}

	}

