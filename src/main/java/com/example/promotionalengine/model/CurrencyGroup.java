package com.example.promotionalengine.model;

public class CurrencyGroup {
	private String currency;
	private String amount;
	public CurrencyGroup() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrencyGroup(String currency, String amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
}
