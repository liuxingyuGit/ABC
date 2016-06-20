package com.demo.service;

import java.util.List;

import com.demo.entity.Page;
import com.demo.entity.Product;
import com.demo.entity.ProductCondition;

public interface ProductService {

	// 分页查询商品
	List<Product> findByPage(Page page);

	// 分页加条件查询商品
	List<Product> findBylist(Page page);

	// 条件查询的总数
	int findProductCountBylist(ProductCondition productCondition);

	// 查询商品总数
	int findProductCount();

	// 添加商品
	int saveProduct(Product product);

	// 删除商品
	int deleteProduct(Integer proid);

	// 根据 ID 查询商品
	Product findProductById(Integer proid);

	// 修改 商品
	int updateProduct(Product product);
}
