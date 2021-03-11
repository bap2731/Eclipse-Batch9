package com.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			System.out.println("Hello");
			if(i==3) {
				continue;
			}
			System.out.println("IM INSIDE THE LOOP");
		}
		
		System.out.println("---------------------------------------------------");
		// Print all numbers1 to 10  except 5 and 6
		for(int i=1; i<=10; i++) {
			if(i==5 || i==6) {
				continue;
				
			}
			
			
			System.out.print(i+" ");
		}
		System.out.println("-------------------------------------------------");
		//print numbers from 1 to 40 except those divisible by 4
		
		for(int i=1;i<40;i++) {
			if(i%4==0) {
				continue;
			}
			System.out.print(i+" ");
		
		
	}

}
}
