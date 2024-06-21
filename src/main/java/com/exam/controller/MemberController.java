package com.exam.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.exam.dto.MemberDTO;
import com.exam.service.MemberService;


@Controller
public class MemberController {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	MemberService memberService;
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	@GetMapping("/signup")
	public String signupForm(ModelMap m) {
		
		m.put("memberDTO", new MemberDTO());
		
		return "memberForm";
	}
	@PostMapping("/signup")
	public String signup(@Valid MemberDTO  dto, BindingResult result) {
		
		if(result.hasErrors()) {
			return "memberForm";
		}
		//DB연동
		logger.info("logger:signup:{}", dto);
		
		// 비번 암호화 필수
		String encptPw = new BCryptPasswordEncoder().encode(dto.getPasswd());
		dto.setPasswd(encptPw);
		
		int n = memberService.memberAdd(dto);
		
		return "redirect:main";
	}
	
	@GetMapping(value={"/mypage"})
	public String mypage(ModelMap m) {
		logger.debug("logger:mypage:");
		
		// Authentication의 실제 데이터는 
		// 
		//  UsernamePasswordAuthenticationToken token
		//= new UsernamePasswordAuthenticationToken(mem, null, list);
		//= new UsernamePasswordAuthenticationToken(Principal, null, list);
		
		// AuthProvider에 저장된 Authentication 얻자
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		logger.info("logger:Authentication:{}", auth);
		MemberDTO memberDTO = (MemberDTO)auth.getPrincipal();
		logger.info("logger:Member:{}", memberDTO);
		
		String userid = memberDTO.getUserid();
		
		MemberDTO searchDTO = memberService.findById(userid);
		m.addAttribute("login", searchDTO);
		
		return "mypage";
	}
	
}