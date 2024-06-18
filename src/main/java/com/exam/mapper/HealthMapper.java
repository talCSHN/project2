package com.exam.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.exam.dto.HealthDTO;

@Mapper
public interface HealthMapper {

	public List<HealthDTO> HealthList(String category);
	public HealthDTO HealthRetrieve(String ponum);
}
