package com.class04;

public class ElseIf {

	public static void main(String[] args) {
		boolean completed=false;
		int score=88;
		
		if(completed) {
			if(score>90) {
				System.out.println("Great job");
			}else if(score>80) {
				System.out.println("Good Job");
			}else if(score>70) {
				System.out.println("Good but lets do better");
			}else {
				System.out.println("Good try but try harder");
			}
				
		}else {
			System.out.println("Please make sure to complete all assigments on time");
		}
	}

}
