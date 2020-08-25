package com.example.promotionalengine;

import static org.mockito.Mockito.doReturn;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.promotionalengine.model.CartItem;
import com.example.promotionalengine.model.Checkout;
import com.example.promotionalengine.model.PromoRules;
import com.example.promotionalengine.service.PromotionalEngineService;

@RunWith(SpringRunner.class)
@WebMvcTest
class PromotionalEngineApplicationTests {
	@Autowired
    private MockMvc mockMvc;
	@MockBean
	private PromotionalEngineService promotionalEngineService;
	
	@Test
	public void PromoOfferTestForSKU_A() throws Exception {
		PromoRules pm = new PromoRules();
		pm.setPromoCode("1101");
		pm.setNumberOfItems(3);
		pm.setPrice(130.00);
		pm.setRules("Buy 3 at the price of 130");
		
		Checkout chk = new Checkout();
		CartItem ct = new CartItem();
		List<CartItem> lst = new ArrayList<CartItem>();
		ct.setItemSKU("A");
		ct.setPromorules(pm);
		lst.add(ct);
		chk.setCartID(43256);
		chk.setCartItem(lst);
		
		doReturn(pm).when(promotionalEngineService).promorules("1101");
	}
	@Test
	public void PromoOfferTestForSKU_B() throws Exception {
		PromoRules pm = new PromoRules();
		pm.setPromoCode("1102");
		pm.setNumberOfItems(2);
		pm.setPrice(45.00);
		pm.setRules("Buy 3 at the price of 130");
		
		doReturn(pm).when(promotionalEngineService).promorules("1102");
	}
	
	@Test
	public void PromoOfferTestForSKU_C_D() throws Exception {
		PromoRules pm = new PromoRules();
		pm.setPromoCode(null);
		pm.setNumberOfItems(null);
		pm.setPrice(null);
		pm.setRules("No Offer Available");
		
		doReturn(pm).when(promotionalEngineService).promorules(null);
	}
	@Test
	public void PromoOfferTestForInvalidPromoCode() throws Exception {
		PromoRules pm = new PromoRules();
		pm.setPromoCode("76544");
		pm.setNumberOfItems(null);
		pm.setPrice(null);
		pm.setRules("Invalid Promo Code.");
		
		doReturn(pm).when(promotionalEngineService).promorules("76544");
	}
	@Test
	void contextLoads() {
	}

}
