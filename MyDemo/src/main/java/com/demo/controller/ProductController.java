package com.demo.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entity.Page;
import com.demo.entity.Product;
import com.demo.entity.ProductCondition;
import com.demo.service.ProductService;

@Controller
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	// 分页加条件查询商品
	@ResponseBody
	@RequestMapping(value = "/queryBylist")
	public Map<String, Object> queryBylist(String proname, Integer page, Integer rows) {
		Map<String, Object> map = new HashMap<String, Object>();
		ProductCondition pc = new ProductCondition();
		pc.setProname(proname);
		Page p = new Page();
		p.setProductCondition(pc);
		p.setPage((page - 1) * rows);
		p.setRows(rows);
		List<Product> list = productService.findByPage(p);
		map.put("total", productService.findProductCountBylist(pc));
		map.put("rows", list);

		return map;
	}

	/**
	 * 分页查询商品
	 * 
	 * @param page
	 * @param rows
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/productlist")
	public Map<String, Object> productlist(Integer page, Integer rows) {
		Map<String, Object> map = new HashMap<String, Object>();
		Page p = new Page();
		p.setProductCondition(null);
		p.setPage((page - 1) * rows);
		p.setRows(rows);
		List<Product> list = productService.findByPage(p);
		map.put("total", productService.findProductCount());
		map.put("rows", list);
		return map;
	}

	/**
	 * 添加商品
	 * 
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/addProduct")
	public int addProduct(Product product) {
		int result = productService.saveProduct(product);
		if (result > 0) {
			return result;
		}
		return 0;
	}

	/**
	 * 删除商品
	 * 
	 * @param proid
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/delProduct")
	public int delProduct(Integer proid) {
		int result = productService.deleteProduct(proid);
		if (result > 0) {
			return result;
		}
		return 0;
	}

	/**
	 * 根据 主键 查询 商品
	 * 
	 * @param proid
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findProById")
	public Product findProById(Integer proid) {
		Product product = productService.findProductById(proid);
		product.setCometime(new Date());
		if (product != null) {
			return product;
		}
		return null;
	}

	/**
	 * 修改商品
	 * 
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/updateProduct")
	public int updateProduct(Product product) {
		int result = productService.updateProduct(product);
		if (result > 0) {
			return result;
		}
		return 0;
	}

}
