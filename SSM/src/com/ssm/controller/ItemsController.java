package com.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.entity.ItemsCustom;
import com.ssm.service.ItemsService;

@Controller
@RequestMapping(value = "/items")
public class ItemsController {

	@Autowired
	private ItemsService itemsService;

	// 用户选好商品后，跳转到购买页面
	@RequestMapping(value = "/userGoods")
	public String userGoods(Integer[] items_id, Model model) throws Exception {
		if (items_id.length == 0) {
			throw new Exception("请选择购买的商品");
		}
		List<ItemsCustom> goodsList = new ArrayList<ItemsCustom>();
		for (Integer id : items_id) {
			ItemsCustom itemsCustom = itemsService.findItemsById(id);
			goodsList.add(itemsCustom);
		}
		model.addAttribute("goodsList", goodsList);
		return "buy";
	}

}
