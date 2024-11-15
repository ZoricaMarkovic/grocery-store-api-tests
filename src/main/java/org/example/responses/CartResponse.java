package org.example.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CartResponse{

	@JsonProperty("created")
	private boolean created;

	@JsonProperty("cartId")
	private String cartId;

	public boolean isCreated(){
		return created;
	}

	public String getCartId(){
		return cartId;
	}
}