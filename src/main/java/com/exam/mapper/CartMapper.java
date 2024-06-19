package com.exam.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.exam.dto.CartDTO;

@Mapper
public interface CartMapper {

	public int cartAdd(CartDTO dto);
	
}
