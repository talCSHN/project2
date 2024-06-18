package com.exam.service;

import java.util.List;

import com.exam.dto.HealthDTO;

public interface HealthService {

	public List<HealthDTO> HealthList(String category);
	public HealthDTO HealthRetrieve(String ponum);
}
