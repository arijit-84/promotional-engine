package com.example.promotionalengine.model;

import java.util.List;

public class InputBody {
	private Integer cartID;
	private List<CartItem> cartItem;
	private Double totalPrice;
	public InputBody() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InputBody(Integer cartID, List<CartItem> cartItem, Double totalPrice) {
		super();
		this.cartID = cartID;
		this.cartItem = cartItem;
		this.totalPrice = totalPrice;
	}
	public Integer getCartID() {
		return cartID;
	}
	public void setCartID(Integer cartID) {
		this.cartID = cartID;
	}
	public List<CartItem> getCartItem() {
		return cartItem;
	}
	public void setCartItem(List<CartItem> cartItem) {
		this.cartItem = cartItem;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}

	
