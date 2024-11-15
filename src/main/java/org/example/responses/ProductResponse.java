package org.example.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductResponse{

	@JsonProperty("name")
	private String name;

	@JsonProperty("inStock")
	private boolean inStock;

	@JsonProperty("id")
	private int id;

	@JsonProperty("category")
	private String category;

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
}