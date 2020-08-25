package com.example.promotionalengine.model;

import java.util.List;

public class Checkout {
	private Integer cartID;
	private List<CartItem> cartItem;
	private Double checkoutPrice;
	public Checkout() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Checkout(Integer cartID, List<CartItem> cartItem, Double checkoutPrice) {
		super();
		this.cartID = cartID;
		this.cartItem = cartItem;
		this.checkoutPrice = checkoutPrice;
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
	public Double getCheckoutPrice() {
		return checkoutPrice;
	}
	public void setCheckoutPrice(Double checkoutPrice) {
		this.checkoutPrice = checkoutPrice;
	}
	
}

	
