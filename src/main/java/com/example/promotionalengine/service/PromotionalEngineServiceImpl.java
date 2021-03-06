package com.example.promotionalengine.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.example.promotionalengine.model.CartItem;
import com.example.promotionalengine.model.Checkout;
import com.example.promotionalengine.model.CurrencyGroup;
import com.example.promotionalengine.model.InputBody;
import com.example.promotionalengine.model.PromoRules;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;


@Service
public class PromotionalEngineServiceImpl implements PromotionalEngineService {
	@Override
	public String checkoutProcess(Checkout inputBody, HttpServletRequest request, HttpServletResponse response) throws Exception{	
		String ret="";
		Double d=0.00;
		try {
			List<CartItem> lst = new ArrayList<>();
			
			for(CartItem temp:inputBody.getCartItem()) {
				CartItem ct=new CartItem();
				PromoRules pm = new PromoRules();
				ct.setItemSKU(temp.getItemSKU());
				ct.setItemPrice(temp.getItemPrice());
				ct.setItemCount(temp.getItemCount());
				
				if("".equals(temp.getPromorules().getPromoCode())) {
					
				Double finalprice=temp.getItemCount()*temp.getItemPrice();			
				d=d+finalprice;
				ct.setTotalItemPrice(finalprice);			
				}
				else {
					pm=promorules(temp.getPromorules().getPromoCode());
					if(pm.getPromoCode()!=null) {
						if(pm.getRules().equalsIgnoreCase("Invalid Promo Code.")) {
							Double finalprice=temp.getItemCount()*temp.getItemPrice();			
							d=d+finalprice;
							ct.setTotalItemPrice(finalprice);
							ct.setPromorules(pm);
						}
						else {
						int quotient = temp.getItemCount()/pm.getNumberOfItems();
						int reminder = temp.getItemCount()%pm.getNumberOfItems();
						Double finalprice=quotient*pm.getPrice()+reminder*temp.getItemPrice();
						
						d=d+finalprice;
						ct.setTotalItemPrice(finalprice);			
						ct.setPromorules(pm);
						}
					}
					else {
						Double finalprice=temp.getItemCount()*temp.getItemPrice();			
						d=d+finalprice;
						ct.setTotalItemPrice(finalprice);
					}
					
				}			
				
				lst.add(ct);
				inputBody.setCartItem(lst);
				inputBody.setCheckoutPrice(d);
				Gson gson = new Gson(); 
			    ret = gson.toJson(inputBody);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

		return ret;
		
	}

	@Override
	public PromoRules promorules(String promoCode) {
		// TODO Auto-generated method stub
		PromoRules pm = new PromoRules();
		try {
			if("1101".equals(promoCode)) {
				pm.setPromoCode(promoCode);
				pm.setNumberOfItems(3);
				pm.setPrice(130.00);
				pm.setRules("Buy 3 at the price of 130");
			}
			else if("1102".equals(promoCode)) {
				pm.setPromoCode(promoCode);
				pm.setNumberOfItems(2);
				pm.setPrice(45.00);
				pm.setRules("Buy 2 at the price of 45");
			}
			else {
				pm.setPromoCode(promoCode);
				pm.setRules("Invalid Promo Code.");
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return pm;
	}

	@Override
	public String currencyGroup(List<CurrencyGroup> inputBody, HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String ret="";
		Map<String,Integer> map=new HashMap<>();
				for(CurrencyGroup temp:inputBody) {
					CurrencyGroup cg=new CurrencyGroup();
					cg.setCurrency(temp.getCurrency());
					cg.setAmount(temp.getAmount());
					
					if(map.containsKey(cg.getCurrency())) {
						int value=map.get(cg.getCurrency());
						value=value+Integer.parseInt(cg.getAmount());
						map.put(cg.getCurrency(), value);
					}
					else {
						map.put(cg.getCurrency(), Integer.valueOf(cg.getAmount()));
					}
					
				}
				ObjectMapper objectMapper = new ObjectMapper();

		        try {
		            ret = objectMapper.writeValueAsString(map);
		            System.out.println(ret);
		        } catch (JsonProcessingException e) {
		            e.printStackTrace();
		        }
		return ret;
	}
}
