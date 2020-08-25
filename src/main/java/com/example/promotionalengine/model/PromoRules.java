package com.example.promotionalengine.model;

public class PromoRules {
		private String promoCode;
		private Integer numberOfItems;
		private Double price;
		private String rules;
		
		public PromoRules() {
			super();
			// TODO Auto-generated constructor stub
		}

		public PromoRules(String promoCode, Integer numberOfItems, Double price, String rules) {
			super();
			this.promoCode = promoCode;
			this.numberOfItems = numberOfItems;
			this.price = price;
			this.rules = rules;
		}

		public String getPromoCode() {
			return promoCode;
		}

		public void setPromoCode(String promoCode) {
			this.promoCode = promoCode;
		}

		public Integer getNumberOfItems() {
			return numberOfItems;
		}

		public void setNumberOfItems(Integer numberOfItems) {
			this.numberOfItems = numberOfItems;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public String getRules() {
			return rules;
		}

		public void setRules(String rules) {
			this.rules = rules;
		}
		
		
}
