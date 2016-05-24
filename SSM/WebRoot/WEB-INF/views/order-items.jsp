<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单明细页面</title>
</head>
<body>
	<p>亲爱的${user.username}用户</p>
	<p>您的订单号：${orderList[0].number}&nbsp;明细如下：</p>
	<table cellpadding="10" cellspacing="0" border="0"
		style="text-align: center;">
		<tr>
			<th></th>
			<th>商品名称</th>
			<th>商品单价</th>
			<th>商品数量</th>
			<th>金额</th>
		</tr>
		<c:forEach var="o" items="${orderList}" varStatus="status">
			<tr>
				<td>${status.index+1}</td>
				<td>${o.name }</td>
				<td>${o.price }</td>
				<td>${o.itemsNum }</td>
				<td>${o.amount }</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5">总计:${totalMoney}&nbsp;&nbsp;
				<input type="button" value="返回首页" onclick="javascript:history.go(-2);"/>
			</td>
		</tr>
	</table>

</body>
</html>