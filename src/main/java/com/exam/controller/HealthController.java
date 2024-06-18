package com.exam.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.exam.dto.HealthDTO;
import com.exam.service.HealthService;

@Controller
public class HealthController {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	HealthService healthService;
	
	public HealthController(HealthService healthService) {
		this.healthService = healthService;
	}


	@GetMapping("/health")
	public String main(@RequestParam String category,ModelMap m) {
		
		List<HealthDTO> healthList = healthService.HealthList(category);
		m.addAttribute("healthList", healthList);
		logger.info("logger:{}",healthList);
		return "healthList";
	}
}
