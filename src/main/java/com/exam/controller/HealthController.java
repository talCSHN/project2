package com.exam.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.exam.dto.HealthDTO;
import com.exam.dto.MemberDTO;
import com.exam.service.HealthService;

@Controller
@SessionAttributes(names = {"login","healthRetrieve"})
public class HealthController {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	HealthService healthService;
	
	public HealthController(HealthService healthService) {
		this.healthService = healthService;
	}


	@GetMapping("/health")
	public String health(@RequestParam String category,ModelMap m) {
		
		List<HealthDTO> healthList = healthService.HealthList(category);
		m.addAttribute("healthList", healthList);
		logger.info("logger:{}",healthList);
		return "healthList";
	}
	
	@GetMapping("/healthRetrieve")
	public String healthRetrieve(@RequestParam String ponum,ModelMap m) {
		
		
		MemberDTO login=(MemberDTO)m.getAttribute("login");
		
		if(login!=null) {
		
			HealthDTO dto = healthService.HealthRetrieve(ponum);
			m.addAttribute("healthRetrieve", dto);
			logger.info("logger:{}",dto);
		
			return "healthRetrieve";
		}
		return "redirect:login";
	}
	
	
}
