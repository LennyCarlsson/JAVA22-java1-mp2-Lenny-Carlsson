package ShoppingApp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean keepOn = true;
		int choice = 0;
		
		Customer customer = new Customer();
		Product product_1 = new Product("Jim Beam", 180, 20 );
		Product product_2 = new Product("Jack Daniels", 220, 20 );
		DiscountedProduct discProduct = new DiscountedProduct("Jelzin Vodka", 170, 20);
		
	
		Scanner scanner = new Scanner(System.in);
		
		while(keepOn) {
			System.out.println();
			System.out.println("1: Buy " + product_1.getName() +", " + product_1.getPrice() +" SEK, " + product_1.getInstock() + " Left" );
			System.out.println("2: Buy " + product_2.getName() +", " + product_2.getPrice() +" SEK, " + product_2.getInstock() + " Left" );
			System.out.println("3: Buy " + discProduct.getName() +", " + discProduct.getPrice() +" SEK, " + discProduct.getInstock() + " Left" );
			System.out.println("4: Quit");
			System.out.println();
			
			System.out.println("Select one Option");
			
			choice = scanner.nextInt();
			
			
			if(choice == 1) {
				System.out.println("You ordered " + product_1.getName() + ", Price: " + product_1.getPrice() + " SEK");
				customer.setPurchasedGoods();
				customer.setSumOfGoods(product_1.getPrice());
				product_1.setInStock();
			
			}
			else if(choice == 2) {
				System.out.println("You ordered " + product_2.getName() + ", Price: " + product_2.getPrice() + " SEK");
				customer.setPurchasedGoods();
				customer.setSumOfGoods(product_2.getPrice());
				product_2.setInStock();
				
				
			}
			else if(choice == 3) {
				System.out.println("You ordered " + discProduct.getName() + ", Price: " + discProduct.getPrice() + " SEK");
				customer.setPurchasedGoods();
				customer.setSumOfGoods(discProduct.getPrice());
				discProduct.setInStock();
				
			}
			else {
				
				System.out.println("Thanks for your order");
				System.out.println("You have purchased " + customer.getPurchasedGoods() + " items to a total cost of " + customer.getSumOfGoods() + " SEK");
				keepOn = false;	
			}
		}
		scanner.close();

	}
	
}
