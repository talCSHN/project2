package com.exam.service;

import java.util.Map;

import com.exam.dto.MemberDTO;

public interface MemberService {

	public int memberAdd(MemberDTO dto);
	
	public MemberDTO findById(String userid);

}
