package com.example.promotionalengine.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.promotionalengine.model.Checkout;
import com.example.promotionalengine.service.PromotionalEngineService;





@RestController
@RequestMapping(value="promotion-api")
public class PromotionalEngineAPI {
	private static final Logger logger=LogManager.getLogger(PromotionalEngineAPI.class);
	
	@Autowired PromotionalEngineService promotionalEngineService;
	
	@GetMapping(value = "promotion-engine")
	public String getPromotionalOfferOnCheckout(@RequestBody Checkout inputBody,HttpServletRequest request, HttpServletResponse response) throws Exception {
		String ret="";
		try {
				logger.info("Promotional Engine Controller Running");				
				ret=promotionalEngineService.checkoutProcess(inputBody, request, response);
			}catch(Exception e) {
				logger.error(e);
				e.printStackTrace();
			}
		
		return ret;
	}
	
}
