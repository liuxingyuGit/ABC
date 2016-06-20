package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductMapper;
import com.demo.entity.Page;
import com.demo.entity.Product;
import com.demo.entity.ProductCondition;
import com.demo.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;

	public List<Product> findByPage(Page page) {
		return productMapper.selectByPage(page);
	}

	public int findProductCount() {
		return productMapper.countByExample(null);
	}

	public int saveProduct(Product product) {
		return productMapper.insertSelective(product);
	}

	public int deleteProduct(Integer proid) {
		return productMapper.deleteByPrimaryKey(proid);
	}

	public Product findProductById(Integer proid) {
		return productMapper.selectByPrimaryKey(proid);
	}

	public int updateProduct(Product product) {
		return productMapper.updateByPrimaryKeySelective(product);
	}

	@Override
	public List<Product> findBylist(Page page) {
		return productMapper.selectByPage(page);
	}

	@Override
	public int findProductCountBylist(ProductCondition productCondition) {
		return 0;
	}

}
