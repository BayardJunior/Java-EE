package entity;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Product> products = new ArrayList<Product>();
	
	public void add(Product p){
		products.add(p);
	}
	
	public List<Product> getProducts(){
		return products;
	}
}
