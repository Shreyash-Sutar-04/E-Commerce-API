package Login;
import java.util.Scanner;


public class main {
	public static void main( String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n ********** E-commerce Begin **********");
		System.out.println("\t #### Login Page ####");
		System.out.println(" \t \t Enter username :");
		String userName = scan.next();
		System.out.println(" \t \t Enter password :");
		String passWord = scan.next();
		
		if(userName.equals("Shreyash")) {
			if(passWord.equals("SHRE2004")) {
				System.out.println("Login Successfull");
				return;
			}
		}
		System.out.println("!!! Login Failed !!!");
	}
}
