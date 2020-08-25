package com.example.promotionalengine.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.promotionalengine.model.Checkout;
import com.example.promotionalengine.model.PromoRules;

public interface PromotionalEngineService {
			public String checkoutProcess(Checkout inputBody, HttpServletRequest request, HttpServletResponse response) throws Exception;
			public PromoRules promorules(String promoCode)throws Exception;
}
