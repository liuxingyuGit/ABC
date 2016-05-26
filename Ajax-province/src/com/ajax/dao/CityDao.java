package com.ajax.dao;

import java.util.List;

import com.ajax.entity.City;

public interface CityDao {

	/**
	 * 根据 省(外键) 查询城市
	 * 
	 * @param province_id
	 * @return
	 * @throws Exception
	 */
	List<City> getCityById(Integer province_id) throws Exception;

}
