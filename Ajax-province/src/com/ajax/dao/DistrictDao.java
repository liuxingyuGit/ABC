package com.ajax.dao;

import java.util.List;

import com.ajax.entity.District;

public interface DistrictDao {

	/**
	 * 根据 城市的ID(外键) 查询区的信息
	 * 
	 * @param city_id
	 * @return
	 * @throws Exception
	 */
	List<District> getDistrictById(Integer city_id) throws Exception;
}
