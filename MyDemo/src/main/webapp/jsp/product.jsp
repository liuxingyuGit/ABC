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
<script type="text/javascript" src="../js/common.js"></script>
<title>商品</title>
<style type="text/css">
</style>
<script type="text/javascript">
	$(function() {
		$("#product-table")
				.datagrid(
						{
							fit : true,
							url : '../product/productlist',
							pagination : true,
							fitColumns : true,
							singleSelect : true,
							onRowContextMenu : onRowContextMenu,
							pageSize : 5,
							pageList : [ 5, 10, 15, 20 ],
							toolbar : [
									{
										text : "添加",
										iconCls : "icon-add",
										handler : function() {
											addProduct();
										}
									},
									{
										text : "修改",
										iconCls : "icon-edit",
										handler : function() {
											editProduct();
										}
									},
									{
										text : "删除",
										iconCls : "icon-remove",
										handler : function() {
											delProduct();
										}
									},
									{
										text : "商品名称&nbsp;<input id='proname' name='proname' type='text'/>",
										iconCls : "icon-search",
										handler : function() {
											var $proname = $("#proname").val();
											if ($proname != '') {
												
											} else {
												$.messager.show({
													title : '系统提示',
													msg : '请输入关键字',
													timeout : 600,
													showType : 'slide'
												});
											}
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
										field : 'proid',
										align : 'center',
										title : '编号',
										width : 100
									},
									{
										field : 'proname',
										align : 'center',
										title : '名称',
										width : 100
									},
									{
										field : 'marketprice',
										align : 'center',
										title : '市场价 &nbsp;(￥/kg)',
										width : 100
									},
									{
										field : 'memberprice',
										align : 'center',
										title : '会员价 &nbsp;(￥/kg)',
										width : 100
									},
									{
										field : 'cometime',
										align : 'center',
										title : '上市时间',
										formatter : function(value, row, index) {
											var unixTimestamp = new Date(value);
											return unixTimestamp
													.toLocaleString();
										}
									}, {
										field : 'prodetail',
										align : 'center',
										title : '商品描述',
										width : 100
									}

							] ],
							//加载成功后的回调函数
							onLoadSuccess : function() {
								//$.messager.alert("提示","加载成功");
							}
						});
	});

	//添加右击菜单内容
	function onRowContextMenu(e, rowIndex, rowData) {
		//右击选中某一行
		$("#product-table").datagrid("selectRow", rowIndex);
		//if判断是右击非行内容时，不显示右击菜单
		if ($("#product-table").datagrid("getSelected") != null) {
			e.preventDefault();
			$('#product-menu').menu('show', {
				left : e.pageX,
				top : e.pageY
			});
		}
	}
	/* S 添加商品的函数  */
	function addProduct() {
		$("#addProductbox").dialog(
				{
					closed : false,
					onClose : function() {
						$("#addProductForm").form("clear");
					},
					buttons : [ {
						text : '提交',
						left : 50,
						handler : function() {

							if ($("#addProductForm").form("validate")) {
								$.post("../product/addProduct", $(
										"#addProductForm").serialize(),
										function(data) {
											if (data > 0) {
												$("#addProductbox").dialog({
													closed : true
												});
												$("#product-table").datagrid(
														"reload");
												$("#addProductForm").form(
														"clear");
												$.messager.show({
													title : '系统提示',
													msg : '商品添加成功',
													timeout : 800,
													showType : 'slide'
												});

											}
										});
							}

						}
					} ]
				});
	}
	/* E 添加商品的函数  */

	/* S 修改商品的函数  */
	function editProduct() {
		if ($("#product-table").datagrid("getSelected") == null) {
			$.messager.show({
				title : '系统提示',
				msg : '请选中要修改的行',
				timeout : 800,
				showType : 'slide'
			});
		} else {
			var $proid = $("#product-table").datagrid("getSelected").proid;
			$("#updateProductForm").form("load",
					"../product/findProById?proid=" + $proid);
			$("#updateProductbox")
					.dialog(
							{
								closed : false,
								buttons : [ {
									text : "提交修改",
									handler : function() {
										if ($("#updateProductForm").form(
												"validate")) {
											$
													.post(
															"../product/updateProduct",
															$(
																	"#updateProductForm")
																	.serialize(),
															function(data) {
																if (data > 0) {
																	$(
																			"#product-table")
																			.datagrid(
																					"reload");
																	$(
																			"#updateProductbox")
																			.dialog(
																					{
																						closed : true
																					});
																	$.messager
																			.show({
																				title : '系统提示',
																				msg : '修改成功',
																				timeout : 1000,
																				showType : 'slide'
																			});
																} else {
																	$.messager
																			.show({
																				title : '系统提示',
																				msg : '修改失败',
																				timeout : 1000,
																				showType : 'slide'
																			});
																}
															});
										}
									}
								} ]
							});
		}
	}
	/* E 修改商品的函数  */

	/* S 删除商品的函数  */
	function delProduct() {
		if ($("#product-table").datagrid("getSelected") == null) {
			$.messager.show({
				title : '系统提示',
				msg : '请选中要删除的行',
				timeout : 800,
				showType : 'slide'
			});
		} else {
			var $name = $("#product-table").datagrid("getSelected").proname;
			$.messager.confirm("系统提示", "确定要删除" + $name + "吗？",
					function(r) {
						if (r) {
							var $proid = $("#product-table").datagrid(
									"getSelected").proid;
							$.post("../product/delProduct", {
								proid : $proid
							}, function(data) {
								if (data > 0) {
									$("#product-table").datagrid("reload");
									$.messager.show({
										title : '系统提示',
										msg : '删除成功',
										timeout : 1000,
										showType : 'slide'
									});
								} else {
									$.messager.show({
										title : '系统提示',
										msg : '删除失败',
										timeout : 1000,
										showType : 'slide'
									});
								}
							});
						}
					});
		}
	}
	/* E 删除商品的函数  */
</script>
</head>
<body>
	<table id="product-table"></table>

	<!-- S 添加商品 -->
	<div class="easyui-dialog" id="addProductbox" closed="true"
		title="添加商品" style="width: 300px; height: 350px;"
		data-options="modal:true">
		<form id="addProductForm">
			<table cellpadding="10" cellspacing="0" style="margin: 5px auto;">
				<tr>
					<td>商品名称</td>
					<td><input class="easyui-validatebox" required="true"
						name="proname" /></td>
				</tr>
				<tr>
					<td>市场价</td>
					<td><input class="easyui-numberbox" required="true"
						name="marketprice" data-options="min:1,precision:2" /></td>
				</tr>
				<tr>
					<td>会员价</td>
					<td><input class="easyui-numberbox" required="true"
						name="memberprice" data-options="min:1,precision:2" /></td>
				</tr>
				<tr>
					<td>上市时间</td>
					<td><input class="easyui-datetimebox" required="true"
						name="cometime" /></td>
				</tr>
				<tr>
					<td>商品描述</td>
					<td><textarea rows="4" cols="22" name="prodetail"></textarea></td>
				</tr>
			</table>
		</form>
	</div>
	<!-- E 添加商品 -->

	<!-- S 修改商品 -->
	<div class="easyui-dialog" id="updateProductbox" closed="true"
		title="修改商品" style="width: 300px; height: 350px;"
		data-options="modal:true">
		<form id="updateProductForm">
			<input type="hidden" name="proid" type="text" />
			<table cellpadding="10" cellspacing="0" style="margin: 5px auto;">
				<tr>
					<td>商品名称</td>
					<td><input class="easyui-validatebox" required="true"
						name="proname" /></td>
				</tr>
				<tr>
					<td>市场价</td>
					<td><input class="easyui-numberbox" required="true"
						name="marketprice" data-options="min:1,precision:2" /></td>
				</tr>
				<tr>
					<td>会员价</td>
					<td><input class="easyui-numberbox" required="true"
						name="memberprice" data-options="min:1,precision:2" /></td>
				</tr>
				<tr>
					<td>上市时间</td>
					<td><input class="easyui-datetimebox" required="true"
						name="cometime" /></td>
				</tr>
				<tr>
					<td>商品描述</td>
					<td><textarea rows="4" cols="22" name="prodetail"></textarea></td>
				</tr>
			</table>
		</form>
	</div>
	<!-- E 修改商品 -->

	<!-- S 表格右键菜单项 -->
	<div class="easyui-menu" id="product-menu" style="width: 100px;">
		<div onClick="view()" data-options="iconCls:'icon-search'">查看</div>
		<div onClick="addProduct()" data-options="iconCls:'icon-add'">新增</div>
		<div onClick="editProduct()" data-options="iconCls:'icon-edit'">编辑</div>
		<div onClick="delProduct()" data-options="iconCls:'icon-remove'">删除</div>
		<div onClick="reload($('#product-table'))"
			data-options="iconCls:'icon-reload'">刷新</div>
	</div>
	<!-- E 表格右键菜单项 -->

</body>
</html>