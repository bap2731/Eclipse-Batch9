package com.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day=1;
		String weekday;
			
		switch(day) {
		case 1:
			weekday ="Monday";
			break;
		case 2:
			weekday="Tuesday";
			break;
		case 3:
			weekday="Wednesday";
			break;
		case 4:
			weekday="Thursday";
			break;
		case 5:
			weekday="Friday";
			break;
		case 6:
			weekday="Saturday";
			break;
		case 7:
			weekday="Sunday";
			break;
		default:
				weekday="invalid";
				break;
		}
			
		}
	}


