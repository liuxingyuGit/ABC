<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="../jquery-easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="../jquery-easyui/themes/icon.css">
<script type="text/javascript" src="../jquery-easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="../jquery-easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="../jquery-easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
	$(function() {
		$("#order-table")
				.datagrid(
						{
							fit : true,
							url : '../order/orderlist',
							pagination : true,
							fitColumns : true,
							singleSelect : true,
							pageSize : 5,
							pageList : [ 5, 10, 15, 20 ],
							toolbar : [ {
								text : "添加",
								iconCls : "icon-add",
								handler : function() {

								}
							}, {
								text : "修改",
								iconCls : "icon-edit",
								handler : function() {

								}
							}, {
								text : "删除",
								iconCls : "icon-remove",
								handler : function() {

								}
							} ],
							columns : [ [
									{
										field : 'proidx',
										title : '<input id=\"detailcheckbox\" type=\"checkbox\"  >',
										align : 'center',
										width : 16,
										formatter : function(value, rec,
												rowIndex) {
											return "<input type=\"checkbox\"  name=\"PD\" value=\"" + rec.proid + "\" >";
										}
									},
									{
										field : 'id',
										align : 'center',
										title : '编号',
										width : 100
									},
									{
										field : 'userId',
										align : 'center',
										title : '订单创建人',
										width : 100
									},
									{
										field : 'number',
										align : 'center',
										title : '订单号',
										width : 100
									},
									{
										field : 'createtime',
										align : 'center',
										title : '创建时间',
										formatter : function(value, row, index) {
											var unixTimestamp = new Date(value);
											return unixTimestamp
													.toLocaleString();
										}
									}, {
										field : 'note',
										align : 'center',
										title : '订单描述',
										width : 100
									}

							] ],
							//加载成功后的回调函数
							onLoadSuccess : function() {
								//$.messager.alert("提示","加载成功");
							}
						});
	});
</script>
<title>订单</title>
</head>
<body>
	<table id="order-table"></table>
</body>
</html>