package Replit;

public class ProperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String userName="Salma";
		String password="Salma123";
		boolean isAllowed=true;
		double accountBalance=1000;
		double amountToTransfer=3000;
	
	if(userName.equals("Salma")) {
		
		if(password.equals("Salma123")) {
			System.out.println("Welcome to bank of America");
			if(accountBalance>=amountToTransfer) {
				System.out.println("Amount transfred");
			
			}else {
				System.out.println("Insuficient balance");
			}
		}else {
			System.out.println("Incorrect password");
		
		}
	
		}else {
		System.out.println("username is not correct please try again");
	}
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	

}
