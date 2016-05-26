package com.ajax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ajax.entity.City;
import com.ajax.entity.District;
import com.ajax.entity.Province;
import com.ajax.service.CityService;
import com.ajax.service.DistrictService;
import com.ajax.service.ProvinceService;

@Controller
public class ProvincialMunicipalLeague {

	@Autowired
	private ProvinceService provinceService;
	@Autowired
	private CityService cityService;
	@Autowired
	private DistrictService districtService;

	/**
	 * 获取省的集合
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/provinces")
	public String provinces(Model model) throws Exception {
		List<Province> provinces = provinceService.findAll();
		model.addAttribute("provinces", provinces);
		return "target";
	}

	/**
	 * 根据省的ID获取市的集合
	 * 
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/citys")
	public List<City> citys(Integer provinceId) throws Exception {
		List<City> citys = cityService.findCityById(provinceId);
		return citys;
	}

	/**
	 * 根据市的ID获取市下的区集合
	 * 
	 * @param cityId
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/districts")
	public List<District> districts(Integer cityId) throws Exception {
		List<District> districts = districtService.findDistrictById(cityId);
		return districts;
	}
}
