<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
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
<script type="text/javascript">
	$(function() {
		$("#user-table")
				.datagrid(
						{
							fit : true,
							url : '../user/userlist',
							pagination : true,
							fitColumns : true,
							singleSelect : true,
							onRowContextMenu : onRowContextMenu,
							pageSize : 5,
							pageList : [ 5, 10, 15, 20 ],
							toolbar : [ {
								text : "添加",
								iconCls : "icon-add",
								handler : function() {
									addUser();
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
									delUser();
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
										field : 'username',
										align : 'center',
										title : '姓名',
										width : 100
									},
									{
										field : 'sex',
										align : 'center',
										title : '性别',
										width : 100
									},
									{
										field : 'birthday',
										align : 'center',
										title : '生日',
										formatter : function(value, row, index) {
											var unixTimestamp = new Date(value);
											return unixTimestamp
													.toLocaleString();
										}
									}, {
										field : 'address',
										align : 'center',
										title : '地址',
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
		$("#user-table").datagrid("selectRow", rowIndex);
		//if判断是右击非行内容时，不显示右击菜单
		if ($("#user-table").datagrid("getSelected") != null) {
			e.preventDefault();
			$('#user-menu').menu('show', {
				left : e.pageX,
				top : e.pageY
			});
		}
	}

	/* S 添加用户  */
	function addUser() {
		$("#addUserbox").dialog(
				{
					closed : false,
					onClose : function() {
						$("#addUserForm").form("clear");
					},
					buttons : [ {
						text : "注册",
						handler : function() {
							if ($("#addUserForm").form("validate")) {
								$.post("../user/register", $("#addUserForm")
										.serialize(), function(data) {
									if (data > 0) {
										$("#addUserbox").dialog({
											closed : true
										});
										$("#user-table").datagrid("reload");
										$("#addUserForm").form("clear");
										$.messager.show({
											title : '系统提示',
											msg : '人员添加成功',

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
	/* E 添加用户  */

	/* S 删除用户  */
	function delUser() {
		if ($("#user-table").datagrid("getSelected") == null) {
			$.messager.show({
				title : '系统提示',
				msg : '请选中要删除的行',
				timeout : 800,
				showType : 'slide'
			});
		} else {
			var $username = $("#user-table").datagrid("getSelected").username;
			$.messager.confirm("系统提示", "你确定删除" + $username + "吗？", function(r) {
				if (r) {
					var $userId = $("#user-table").datagrid("getSelected").id;
					$.post("../user/delUser", {
						id : $userId
					}, function(data) {
						if (data > 0) {
							$("#user-table").datagrid("reload");
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
	/* E 删除用户  */
</script>
<title>用户</title>
<style type="text/css">
</style>
</head>
<body>
	<table id="user-table"></table>

	<!-- S 注册 -->
	<div class="easyui-dialog" id="addUserbox" closed="true" title="添加人员"
		style="width: 300px; height: 350px;"
		data-options="modal:true,inline:false">
		<form id="addUserForm">
			<table cellpadding="10" cellspacing="0" style="margin: 5px auto;">
				<tr>
					<td>用户名</td>
					<td><input class="easyui-validatebox" required="true"
						name="username" /></td>
				</tr>
				<tr>
					<td>密码</td>
					<td><input class="easyui-validatebox" required="true"
						name="password" type="password" /></td>
				</tr>
				<tr>
					<td>性别</td>
					<td>男<input type="radio" value="男" checked="checked"
						name="sex" /> 女<input type="radio" value="女" name="sex" /></td>
				</tr>
				<tr>
					<td>生日</td>
					<td><input class="easyui-datebox" required="true"
						name="birthday" /></td>
				</tr>
				<tr>
					<td>地址</td>
					<td><textarea rows="4" cols="22" name="address"></textarea></td>
				</tr>
			</table>
		</form>
	</div>
	<!-- E 注册 -->

	<!-- S 表格右键菜单项 -->
	<div class="easyui-menu" id="user-menu" style="width: 100px;">
		<div onClick="view()" data-options="iconCls:'icon-search'">查看</div>
		<div onClick="addUser()" data-options="iconCls:'icon-add'">新增</div>
		<div onClick="editUser()" data-options="iconCls:'icon-edit'">编辑</div>
		<div onClick="delUser()" data-options="iconCls:'icon-remove'">删除</div>
		<div onClick="reload($('#user-table'))"
			data-options="iconCls:'icon-reload'">刷新</div>
	</div>
	<!-- E 表格右键菜单项 -->
</body>
</html>