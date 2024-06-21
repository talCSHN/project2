package com.exam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exam.dto.BuyGoodsDTO;
import com.exam.dto.CartDTO;
import com.exam.mapper.BuyGoodsMapper;

@Service
public class BuyGoodsServiceImpl implements BuyGoodsService {

	BuyGoodsMapper adminMapper;
	
	public BuyGoodsServiceImpl(BuyGoodsMapper adminMapper) {
		this.adminMapper = adminMapper;
	}

	@Override
	public List<BuyGoodsDTO> adminList(String userid) {
		return adminMapper.adminList(userid);
	}

	@Override
	public int buyGoods(List<CartDTO> cartDTO) {
		return adminMapper.buyGoods(cartDTO);
	}

	

	
}
