package com.exam.service;

import java.util.List;

import com.exam.dto.BuyGoodsDTO;
import com.exam.dto.CartDTO;

public interface BuyGoodsService {

	public List<BuyGoodsDTO> adminList(String userid);
	
	public int buyGoods(List<CartDTO> listCartDTO);
}
