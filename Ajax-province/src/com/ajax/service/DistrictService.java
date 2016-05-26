package com.ajax.service;

import java.util.List;

import com.ajax.entity.District;

public interface DistrictService {

	/**
	 * 根据 城市的ID(外键) 查询区的信息
	 * 
	 * @param city_id
	 * @return
	 * @throws Exception
	 */
	List<District> findDistrictById(Integer city_id) throws Exception;
}
