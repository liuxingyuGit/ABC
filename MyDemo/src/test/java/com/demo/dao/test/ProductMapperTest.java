package com.demo.dao.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.entity.ProductCondition;
import com.demo.service.ProductService;

import junit.framework.*;

public class ProductMapperTest extends TestCase {

	private ApplicationContext cxt = null;
	
	{
		cxt = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
	}

	public void testSelectCountByCondition() {
		ProductCondition pc = new ProductCondition();
		pc.setProname("本");
		int value = cxt.getBean(ProductService.class).findProductCountBylist(pc);
		System.out.println(value);
	}

	public void testSelectByPage() {
	}
	
	public static void main(String[] args) {
		new ProductMapperTest().testSelectCountByCondition();
	}

}
