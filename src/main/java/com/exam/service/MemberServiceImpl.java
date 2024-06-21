package com.exam.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.exam.dto.MemberDTO;
import com.exam.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{

	MemberMapper memberMapper;
	
	public MemberServiceImpl(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}


	@Override
	public int memberAdd(MemberDTO dto) {
		return memberMapper.memberAdd(dto);
	}


	@Override
	public MemberDTO findById(String userid) {
		return memberMapper.findById(userid);
	}

}
