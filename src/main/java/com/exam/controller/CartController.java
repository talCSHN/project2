package com.exam.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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
@SessionAttributes(names = {"healthRetrieve","cartList"})
public class CartController {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	CartService cartService;
	
	@GetMapping("/cartAdd")
	public String cartAdd(ModelMap m) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		MemberDTO memberDTO = (MemberDTO)auth.getPrincipal();
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
	
	@PostMapping("/cartDelete")
	public String cartDelete(@RequestParam("num") int num, ModelMap m) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		MemberDTO memberDTO = (MemberDTO)auth.getPrincipal();
		
		//CartDTO cartDTO = new CartDTO();
		//int del = cartDTO.getNum();
		
		logger.info("Deleting cart item with num: {}", num);
		//int delete = 
		 
		cartService.cartDelete(num);
		
		//m.addAttribute("cartDelete", delete);
		
		return "redirect:cartList";
	}
	
	@GetMapping("/cartList")
	public String cartList(ModelMap m) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		MemberDTO memberDTO = (MemberDTO)auth.getPrincipal();
		String userid = memberDTO.getUserid();
		
		List<CartDTO> searchDTO = cartService.cartList(userid);
		m.addAttribute("cartList", searchDTO);
		
		logger.info("cartList:{}", searchDTO);
		return "cartList";
	}
	
	
}
