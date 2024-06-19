package com.exam.service;

import org.springframework.stereotype.Service;

import com.exam.dto.CartDTO;
import com.exam.mapper.CartMapper;

@Service
public class CartServiceImpl implements CartService {

	CartMapper cartMapper;
	
	public CartServiceImpl(CartMapper cartMapper) {
		this.cartMapper = cartMapper;
	}

	@Override
	public int cartAdd(CartDTO dto) {
		return cartMapper.cartAdd(dto);
	}

}
