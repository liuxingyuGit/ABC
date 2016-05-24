package com.ssm.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.entity.OrderdetailCustom;
import com.ssm.entity.OrderdetailQueryVo;
import com.ssm.entity.OrdersCustom;
import com.ssm.entity.User;
import com.ssm.mapper.OrdersMapperCustom;
import com.ssm.service.OrderDetailService;
import com.ssm.service.OrdersService;
import com.ssm.util.UUIDUtil;

@Controller
@RequestMapping(value = "/orders")
public class OrdersController {

	@Autowired
	private OrdersService ordersService;

	@Autowired
	private OrderDetailService orderDetailService;

	// 用户购买，添加订单——>级联添加订单明细
	@RequestMapping(value = "/addOrders")
	public String addOrders(OrderdetailQueryVo orderdetailQueryVo, HttpServletRequest request, Model model)
			throws Exception {
		User user = (User) request.getSession().getAttribute("user");

		OrdersCustom ordersCustom = new OrdersCustom();
		ordersCustom.setNumber(UUIDUtil.getUUID());// 生成订单号
		ordersCustom.setUserId(user.getId());// 获取用户ID
		// 添加订单
		int result = ordersService.insertOrders(ordersCustom);
		// 添加订单明细
		OrderdetailCustom orderdetailCustom = new OrderdetailCustom();
		int orders_id = ordersCustom.getId(); // 订单明细中的外键(也就是订单号)
		int value = 0;// 记录订单明细是否添加成功
		Float totalMoney = 0f ; // 一个用户购买的总金额
		// 循环添加订单明细
		for (int i = 0; i < orderdetailQueryVo.getItemsList().size(); i++) {
			orderdetailCustom.setOrdersId(orders_id);
			orderdetailCustom.setItemsId(orderdetailQueryVo.getItemsList().get(i).getItems_id());
			orderdetailCustom.setItemsNum(orderdetailQueryVo.getItemsList().get(i).getItems_num());
			orderdetailCustom.setAmount(orderdetailQueryVo.getItemsList().get(i).getItems_price()
					* orderdetailQueryVo.getItemsList().get(i).getItems_num());
			value = orderDetailService.addOrderDetail(orderdetailCustom);
			totalMoney += orderdetailCustom.getAmount();
			if (value == 0) {
				break;
			}
		}
		if (result > 0 && value > 0) {
			List<OrdersCustom> list = ordersService.findOrderAndItems(orders_id);
			String number = list.get(0).getNumber();
			model.addAttribute("orderList", list);
			model.addAttribute("user", user);
			model.addAttribute("totalMoney", totalMoney);
			// 成功后跳转至订单明细页面
			return "order-items";
		}
		// 失败后跳转至购买页面
		return "buy";
	}

}
