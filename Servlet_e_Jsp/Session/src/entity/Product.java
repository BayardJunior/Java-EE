package entity;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Product {

	private static Map<Integer, Product> products;
	
	static{
		products = new LinkedHashMap<Integer,Product>();
		products.put(1, new Product(1,"P1", 100));
		products.put(2, new Product(2,"P2", 200));
		products.put(3, new Product(3,"P3", 300));
		products.put(4, new Product(4,"P4", 400));
	}
	
	private int id;
	private String name;
	private double value;
	
	private Product(int id, String name, double value){
		
		this.id = id;
		this.name = name;
		this.value = value;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	public static Collection<Product> getProducts() {
		return products.values();
	}

	public static Product getProductById(int id){
		return products.get(id);
	}
}