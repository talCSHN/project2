package com.exam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exam.dto.HealthDTO;
import com.exam.mapper.HealthMapper;

@Service
public class HealthServiceImpl implements HealthService{

	HealthMapper healthMapper;
	
	public HealthServiceImpl(HealthMapper healthMapper) {
		this.healthMapper = healthMapper;
	}

	@Override
	public List<HealthDTO> HealthList(String category) {
		return healthMapper.HealthList(category);
	}

	@Override
	public HealthDTO HealthRetrieve(String ponum) {
		return healthMapper.HealthRetrieve(ponum);
	}

}
