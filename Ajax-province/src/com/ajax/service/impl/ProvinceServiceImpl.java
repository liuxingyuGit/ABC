package com.ajax.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ajax.dao.ProvinceDao;
import com.ajax.entity.Province;
import com.ajax.service.ProvinceService;

public class ProvinceServiceImpl implements ProvinceService {

	@Autowired
	private ProvinceDao provinceDao;

	@Override
	public List<Province> findAll() throws Exception {
		return provinceDao.getAll();
	}

}
