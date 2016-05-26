package com.ajax.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ajax.dao.DistrictDao;
import com.ajax.entity.District;
import com.ajax.service.DistrictService;

public class DistrictServiceImpl implements DistrictService {

	@Autowired
	private DistrictDao districtDao;

	@Override
	public List<District> findDistrictById(Integer city_id) throws Exception {
		return districtDao.getDistrictById(city_id);
	}

}
