package com.exam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.exam.dto.CartDTO;
import com.exam.dto.HealthDTO;
import com.exam.dto.MemberDTO;
import com.exam.service.CartService;

@Controller
@SessionAttributes(names = {"login"})
public class CartController {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	CartService cartService;
	
	@PostMapping("/cartAdd")
	public String cartAdd(ModelMap m) {
		

		
		return "";
	}
	
	
	
	
}
