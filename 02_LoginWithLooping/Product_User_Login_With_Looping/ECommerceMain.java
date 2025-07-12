package Product_User_Login_With_Looping;

import java.util.Scanner;

public class ECommerceMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\n******** Welcome to Ecommerce Management *******");
		Login.login();
		while(true) {
			System.out.println("\nWhat Would you like to do today?");
			System.out.println("1. Product Management");
			System.out.println("2. User Management");
			System.out.println("3. Quit");
			
			int option = scan.nextInt();
			
			if(option == 1) {
				ProductManagement.productManagement();
			}else if(option == 2) {
				UserManagement.userManagement();
			}else if(option == 3) {
				System.out.println("Returning to the main menu.");
				return;
			}

		}
	}

}
