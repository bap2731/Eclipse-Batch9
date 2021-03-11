package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		int num=10;
		 num=20;
		 System.out.println(num);
		 int[] array=new int[5];
		 array[0]=10;
		 array[1]=12;
		 array[2]=15;
		 array[3]=9;
		 array[4]=13;
		 
		 System.out.println(array[0]+array[4]);
		 
		 double[] numbers=new double[2];
		 numbers[0]=10.99;
		 numbers[1]=19.01;
		 
		 numbers[0]=11.99;
		 System.out.println(numbers[0]);
		 
		 String[] names=new String[3];
		 names[0]="Jahanzeb";
		 names[1]="Ozoda";
		 names[2]="Alec";
		 System.out.println(names[2]);
		 
		 boolean b[]=new boolean[3];
		 b[0]=true;
		 b[1]=true;
		 b[2]=false;
		 System.out.println(b[2]);
		  int size=b.length;
		  System.out.println("size of array is "+size);
		  
		  char [] grade;
		  grade=new char[6];
		  grade[0]='A';
		  grade[1]='B';
		  grade[2]='C';
		  grade[3]='D';
		  grade[4]='E';
		  grade[5]='F';
		  
		  System.out.println(grade[1]);
		  System.out.println("-----------------another way----------------");
		  
		  char[] grades= {'A','B','C','D','E','F','G','H'};
		
		  System.out.println(grades[6]);	
		  System.out.println("number of elements in 2 array "+grades.length);
		
		
	}

}
