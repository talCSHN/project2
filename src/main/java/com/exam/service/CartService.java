package com.exam.service;

import com.exam.dto.CartDTO;

public interface CartService {

	public int cartAdd(CartDTO dto);
	public CartDTO cartList(String userid);
}
