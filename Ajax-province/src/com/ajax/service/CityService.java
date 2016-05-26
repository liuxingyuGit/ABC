package com.ajax.service;

import java.util.List;

import com.ajax.entity.City;

public interface CityService {

	/**
	 * 根据 省(外键) 查询城市
	 * 
	 * @param province_id
	 * @return
	 * @throws Exception
	 */
	List<City> findCityById(Integer province_id) throws Exception;
}
