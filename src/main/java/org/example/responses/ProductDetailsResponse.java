package org.example.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductDetailsResponse{

	@JsonProperty("current-stock")
	private int currentStock;

	@JsonProperty("price")
	private Object price;

	@JsonProperty("name")
	private String name;

	@JsonProperty("inStock")
	private boolean inStock;

	@JsonProperty("id")
	private int id;

	@JsonProperty("category")
	private String category;

	@JsonProperty("manufacturer")
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

	public boolean isInStock(){
		return inStock;
	}

	public int getId(){
		return id;
	}

	public String getCategory(){
		return category;
	}

	public String getManufacturer(){
		return manufacturer;
	}
}