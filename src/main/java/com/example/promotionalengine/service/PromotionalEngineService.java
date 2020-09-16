package com.example.promotionalengine.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.promotionalengine.model.Checkout;
import com.example.promotionalengine.model.CurrencyGroup;
import com.example.promotionalengine.model.InputBody;
import com.example.promotionalengine.model.PromoRules;

public interface PromotionalEngineService {
			public String checkoutProcess(Checkout inputBody, HttpServletRequest request, HttpServletResponse response) throws Exception;
			public PromoRules promorules(String promoCode)throws Exception;
			public String currencyGroup(List<CurrencyGroup> inputBody, HttpServletRequest request, HttpServletResponse response) throws Exception;
}
