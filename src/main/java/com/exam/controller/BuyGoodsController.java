package com.exam.controller;

import java.time.LocalDate;
import java.util.ArrayList;
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

import com.exam.dto.BuyGoodsDTO;
import com.exam.dto.CartDTO;
import com.exam.dto.MemberDTO;
import com.exam.service.BuyGoodsService;

@Controller
@SessionAttributes(names = { "healthRetrieve","cartList" })
public class BuyGoodsController {
   
   Logger logger = LoggerFactory.getLogger(getClass());
   
   @Autowired
   BuyGoodsService buyGoodsService;
   
   @GetMapping("/admin")
   public String admin(ModelMap m) {
       // 현재 사용자의 Authentication 객체 가져오기
       Authentication auth = SecurityContextHolder.getContext().getAuthentication();
       MemberDTO memberDTO = (MemberDTO) auth.getPrincipal();
       String userid = memberDTO.getUserid();

       // buyGoodsService를 사용하여 현재 사용자의 BuyGoodsDTO 리스트 가져오기
       List<BuyGoodsDTO> buyGoodsList = buyGoodsService.adminList(userid);

       // 가져온 BuyGoodsDTO 리스트를 ModelMap에 추가
       m.addAttribute("adminList", buyGoodsList);
       
       // 로깅을 통해 가져온 데이터 확인
       logger.info("AdminList for userid {}: {}", userid, buyGoodsList);

       return "adminList";
   }

   
      @PostMapping("/buy")
      public String buy(ModelMap m) {
    	 
    	 List<CartDTO> cartDTO = (List<CartDTO>)m.getAttribute("cartList");
         logger.info("logger:{}",cartDTO);
         
         
         
         int main = buyGoodsService.buyGoods(cartDTO);
         
      
         return "main";
         
      }
   
   
   
}
