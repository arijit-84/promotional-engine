package com.example.promotionalengine.model;

import java.util.List;

public class InputBody {
	private Integer cartID;
	private List<CartItem> cartItem;
	private List<CurrencyGroup> currencyGroup;
	private Double totalPrice;
	public InputBody() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public InputBody(Integer cartID, List<CartItem> cartItem, List<CurrencyGroup> currencyGroup, Double totalPrice) {
		super();
		this.cartID = cartID;
		this.cartItem = cartItem;
		this.currencyGroup = currencyGroup;
		this.totalPrice = totalPrice;
	}


	public List<CurrencyGroup> getCurrencyGroup() {
		return currencyGroup;
	}
	public void setCurrencyGroup(List<CurrencyGroup> currencyGroup) {
		this.currencyGroup = currencyGroup;
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

	
