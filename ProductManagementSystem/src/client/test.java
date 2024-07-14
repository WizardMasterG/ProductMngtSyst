package client;

import java.util.Scanner;

import entity.Product;
import repository.Productitems;

public class test {
	
	public static void displayMenu() {
		System.out.println("Choose an option");
		System.out.println("1.Add Product");
		System.out.println("2.Display Products");
		System.out.println("3.Remove Product");
		System.out.println("4.Exit");
	}
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		Productitems productItems=new Productitems();
		while(true) {
			displayMenu();
			int choice=scanner.nextInt();
			if(choice==1) {
				System.out.println("Adding product");
				System.out.println("Enter product id:");
				int id=scanner.nextInt();
				System.out.println("Enter product name:");
				String name=scanner.next();
				System.out.println("Enter product type:");
				String type=scanner.next();
				System.out.println("Enter product price:");
				double price=scanner.nextInt();
				System.out.println("Enter product quantity:");
				int quantity=scanner.nextInt();
				Product p1=new Product(id,name,type,price,quantity);
				productItems.addProduct(p1);
				}
			else if(choice==2) {
				System.out.println("Display product");
				productItems.displayProducts();
			}
			else if(choice==3) {
				//System.out.println("Remove product");
				System.out.println("Enter product if to delete:");
				int id=scanner.nextInt();
				if(productItems.removeProduct(id)) {
					System.out.println("Product deleted");
				}
				else {
					System.out.println("Could not delete product");
				}
			}
			else  {
				System.out.println("Thank you");
				break;
			}
		}
		scanner.close();
	}

}
