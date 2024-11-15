package org.example.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemRequest{

	@JsonProperty("quantity")
	private int quantity;

	@JsonProperty("productId")
	private int productId;

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public int getQuantity(){
		return quantity;
	}

	public void setProductId(int productId){
		this.productId = productId;
	}

	public int getProductId(){
		return productId;
	}
}