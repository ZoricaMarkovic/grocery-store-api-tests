package org.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductDetails{

	private int currentStock;

	private Object price;

	private String name;

	private boolean inStock;

	private String category;

	private String manufacturer;

	public int getCurrentStock(){
		return currentStock;
	}

	public Object getPrice(){
		return price;
	}

	public String getName(){
		return name;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(Object price) {
		this.price = price;
	}

	public void setCurrentStock(int currentStock) {
		this.currentStock = currentStock;
	}

	public boolean isInStock(){
		return inStock;
	}

	public String getCategory(){
		return category;
	}

	public String getManufacturer(){
		return manufacturer;
	}
}