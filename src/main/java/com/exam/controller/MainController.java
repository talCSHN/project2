package com.exam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.exam.service.HealthService;

@Controller
public class MainController {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	HealthService goodsService;
	
	public MainController(HealthService goodsService) {
		this.goodsService = goodsService;
	}


	@GetMapping("/main")
	public String main() {
		
		return "main";
	}
}
