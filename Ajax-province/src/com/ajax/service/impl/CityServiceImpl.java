package com.ajax.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ajax.dao.CityDao;
import com.ajax.entity.City;
import com.ajax.service.CityService;

public class CityServiceImpl implements CityService {

	@Autowired
	private CityDao cityDao;
	
	@Override
	public List<City> findCityById(Integer province_id) throws Exception {
		return cityDao.getCityById(province_id);
	}

}
