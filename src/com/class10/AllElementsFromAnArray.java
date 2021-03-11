package com.class10;

public class AllElementsFromAnArray {

	public static void main(String[] args) {

		int[]numbers= {10, 14, 78, 5, 90, 76, 1, 8};
		for (int i=0; i<numbers.length; i++) {
			if(numbers[i] % 2 ==0)
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
		System.out.println("-----------print in reverse-----------");
		
		for(int i=numbers.length-1; i>=0; i--) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------");
		char[] grades= {'A','B','C','D','E','F','G','H'} ;
		for (char grade:grades) {
			System.out.print(grade+" ");
		}
		System.out.println();
		System.out.println("---------------------------------");
		boolean[] boo= {true,false,false,false,true};
		for(boolean b:boo) {
			System.out.print(b+" ");
		}
		
	}

}
