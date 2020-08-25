package com.example.promotionalengine.model;

public class CartItem {
	private String itemSKU;
	private Integer itemCount;
	private Double itemPrice;
	private Double totalItemPrice;
	private PromoRules promorules;
	
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartItem(String itemSKU, Integer itemCount, Double itemPrice, Double totalItemPrice, PromoRules promorules) {
		super();
		this.itemSKU = itemSKU;
		this.itemCount = itemCount;
		this.itemPrice = itemPrice;
		this.totalItemPrice = totalItemPrice;
		this.promorules = promorules;
	}

	public String getItemSKU() {
		return itemSKU;
	}

	public void setItemSKU(String itemSKU) {
		this.itemSKU = itemSKU;
	}

	public Integer getItemCount() {
		return itemCount;
	}

	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Double getTotalItemPrice() {
		return totalItemPrice;
	}

	public void setTotalItemPrice(Double totalItemPrice) {
		this.totalItemPrice = totalItemPrice;
	}

	public PromoRules getPromorules() {
		return promorules;
	}

	public void setPromorules(PromoRules promorules) {
		this.promorules = promorules;
	}
	
}
