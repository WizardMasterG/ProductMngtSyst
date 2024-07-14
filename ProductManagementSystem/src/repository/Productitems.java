package repository;

import java.util.ArrayList;

import entity.Product;

public class Productitems {
	
	ArrayList<Product> productList = new ArrayList<>();
	
	public void addProduct(Product product) {
		productList.add(product);
		System.out.println("Product added successfully");
	}
	public boolean removeProduct(int prodid) {
		for(int i=0;i<productList.size();i++) {
			Product product=productList.get(i);
			if(product.pid==prodid) {
				productList.remove(product);
				return true;
			}
		}
		return false;
	}
	public void displayProducts() {
		if(productList.size()==0)
		{
			System.out.println("No product added yet");
			return;
		}
		System.out.println("Id\tName\tPrice\tQty\tInStock");
		for(int i=0;i<productList.size();i++) {
			Product product=productList.get(i);
			System.out.print(product.pid+"\t"+product.name+"\t"+product.price+"\t"+product.quantity);
			if(product.inStock)
			System.out.println("\tyes");
			else
				System.out.println("\tno");
		}
	}
}
