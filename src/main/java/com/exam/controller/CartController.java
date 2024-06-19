package com.exam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.exam.dto.CartDTO;
import com.exam.dto.HealthDTO;
import com.exam.dto.MemberDTO;
import com.exam.service.CartService;

@Controller
@SessionAttributes(names = {"login","healthRetrieve"})
public class CartController {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	CartService cartService;
	
	@GetMapping("/cartAdd")
	public String cartAdd(ModelMap m) {
		
		MemberDTO memberDTO = (MemberDTO)m.getAttribute("login");
		HealthDTO healthDTO =(HealthDTO)m.getAttribute("healthRetrieve");
		
		logger.info("logger:{}",healthDTO);
		logger.info("logger:{}",memberDTO);
		
		String userid = memberDTO.getUserid();
		String poname = healthDTO.getPoname();
		String price = healthDTO.getPrice();
		String period = healthDTO.getPeriod();
		String pt_count = healthDTO.getPt_count();
		String ponum = healthDTO.getPonum();
		
		CartDTO cartDTO = new CartDTO();
		cartDTO.setUserid(userid);
		cartDTO.setPonum(ponum);
		cartDTO.setPoname(poname);
		cartDTO.setPrice(price);
		cartDTO.setPeriod(period);
		cartDTO.setPt_count(pt_count);
		
		int n = cartService.cartAdd(cartDTO);
		
		return "main";
	}
	
	
	
	
}
