package com.ajax.service;

import java.util.List;

import com.ajax.entity.Province;

public interface ProvinceService {
	
	List<Province> findAll() throws Exception;
}
