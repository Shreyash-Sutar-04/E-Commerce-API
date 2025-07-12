package Product_User_Login_With_Looping;

import java.util.Scanner;

public class UserManagement {
	public static void userManagement() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to user Management ");
		
		while(true) {
			System.out.println("What would you like to do");
			System.out.println("1. Add User");
			System.out.println("2. Update user");
			System.out.println("3. Search User");
			System.out.println("4. Delete user");
			System.out.println("9. Quit user interface");
			
			int option = sc.nextInt();
			if(option == 1) {
				System.out.println("Enter user name :");
				String name = sc.next();
				System.out.println("Enter e-mail address :");
				String email = sc.next();
				System.out.println("Enter password :");
				String password = sc.next();
				
				System.out.println("The username is :"+name);
				System.out.println("The email id :"+email);
				System.out.println("The password is :"+password);
			}else if(option == 2) {
				System.out.println("To be implemented!");
			}else if(option == 3) {
				System.out.println("To be implemented!");
			}else if(option == 4) {
				System.out.println("To be implemented!");
			}else if(option == 5) {
				System.out.println("To be implemented!");
			}else if(option == 9) {
				System.out.println("Quitting user interface");
				return;
			}else {
				System.out.println("Invalid option selected");
			}
		}
		
	}

}
