package com.exam.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.exam.dto.GoodsDTO;
import com.exam.service.GoodsService;

@Controller
public class HealthController {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	GoodsService goodsService;
	
	public HealthController(GoodsService goodsService) {
		this.goodsService = goodsService;
	}


	@GetMapping("/health")
	public String main(@RequestParam String category,ModelMap m) {
		
		List<GoodsDTO> goodslist = goodsService.goodsList(category);
		m.addAttribute("goodslist", goodslist);
		return "healthList";
	}
}
