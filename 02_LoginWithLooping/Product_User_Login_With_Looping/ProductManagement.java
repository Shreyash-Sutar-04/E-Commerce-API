package Product_User_Login_With_Looping;
import java.util.Scanner;
public class ProductManagement {
	public static void productManagement() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Product Management.");
		
		while(true) {
			System.out.println("What would you like to do!");
			System.out.println("1.Add Product");
			System.out.println("2.Update Product");
			System.out.println("3. Search Product");
			System.out.println("4. Delete Product");
			System.out.println("9. Quit the ProductManagemtn service.");
			
			int option = sc.nextInt();
			if(option == 1) {
				System.out.println("Enter product name :");
				String productName = sc.next();
				System.out.println("Enter product price");
				int price = sc.nextInt();
				System.out.println("Enter the Quantity :");
				int quantity = sc.nextInt();
				
				System.out.println("Product Name :"+productName);
				System.out.println("Product Price :"+price);
				System.out.println("Product Quantity :"+quantity);
			}else if(option == 2) {
				System.out.println("To be implemented");
			}else if(option == 3) {
				System.out.println("To be implemented");
			}else if(option == 4) {
				System.out.println("To be implemented");
			}else if (option == 9){
				System.out.println("Returning to Home page!");
				return;
			}else {
				System.out.println("Invalid option selected");
			}
		}
	}

}
