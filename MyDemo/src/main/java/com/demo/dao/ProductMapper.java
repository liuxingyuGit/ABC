package com.demo.dao;

import com.demo.entity.Page;
import com.demo.entity.Product;
import com.demo.entity.ProductCondition;
import com.demo.entity.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
	int countByExample(ProductExample example);

	int deleteByExample(ProductExample example);

	int deleteByPrimaryKey(Integer proid);

	int insert(Product record);

	int insertSelective(Product record);
	
	int selectCountByCondition(ProductCondition condition);

	List<Product> selectByExample(ProductExample example);

	List<Product> selectByPage(Page page);

	Product selectByPrimaryKey(Integer proid);

	int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

	int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

	int updateByPrimaryKeySelective(Product record);

	int updateByPrimaryKey(Product record);
}