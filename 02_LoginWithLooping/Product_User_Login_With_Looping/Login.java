package Product_User_Login_With_Looping;

import java.util.Scanner;

public class Login {
	public static void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("^^^^^^^Login Information^^^^^^^");
		System.out.println("Enter username : ");
		String userName = sc.next();
		System.out.println("Enter password :");
		String passWord = sc.next();
		
		if(userName.equals("Shreyash")) {
			if(passWord.equals("SHRE2004")) {
				System.out.println("Login Successfull!");
				return;
			}
		}
		System.out.println("!!! Login Failed !!!");
		System.exit(0);
		
	}

}
