<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
<link rel="stylesheet" type="text/css"
	href="jquery-easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="jquery-easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="css/index.css">
<script type="text/javascript" src="jquery-easyui/jquery.min.js"></script>
<script type="text/javascript" src="jquery-easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="jquery-easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="js/index.js"></script>

<script type="text/javascript">
	
</script>
<style type="text/css">
</style>
</head>
<body class="easyui-layout">
	<!--S 北方(头部) -->
	<div data-options="region:'north',title:'',split:false"
		style="height: 80px;">
		<div class="north-top">
			<h1 class="top-title">在线测试平台管理系统</h1>
			<div class="top-log-reg-box">
				<a class="top-login" href="javascript:void(0)"
					onclick="$('#login-box').dialog('open')">登录</a> <a
					class="top-register" href="javascript:void(0)"
					onclick="$('#reg-box').dialog('open')">注册</a>
			</div>
		</div>
	</div>
	<!--E 北方 -->

	<!--S 西方(菜单树) -->
	<div data-options="region:'west',title:'导航菜单',split:false"
		style="width: 160px;">
		<ul id="menu-tree"></ul>
	</div>
	<!--E 西方 -->

	<!--S 中间 (信息展示)-->
	<div data-options="region:'center',title:''"
		style="padding: 3px; background: #eee;">
		<div class="easyui-tabs" fit="true" border="false" id="tabs">
			<div align="center" data-options="title:'系统页面'">
				<h1>欢迎使用该系统</h1>
			</div>
		</div>
	</div>
	<!--E 中间 -->

	<!-- S 登录 -->
	<div id="login-box" class="easyui-dialog" title="&nbsp;登&nbsp;录"
		style="width: 300px; height: 220px;" data-options="modal:true">
		<div id="login-content">
			<form class="login-form" method="post">
				<table>
					<tr>
						<td>ID</td>
						<td><input type="text" name="id" class="easyui-validatebox"
							data-options="required:true" /></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" name="password"
							class="easyui-validatebox" data-options="required:true" /></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" id="subutton"
							value="登&nbsp;录" /></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<!-- E 登录 -->

	<!-- S 注册 -->
	<div id="reg-box" class="easyui-dialog" title="&nbsp;注&nbsp;册"
		style="width: 374px; height: 386px;" data-options="modal:true">

		<div id="reg-content">
			<form id="reg-form" method="post">
				<table cellpadding="10" cellspacing="0">
					<tr>
						<td>姓名</td>
						<td><input id="input-text" type="text" name="username"
							class="easyui-validatebox" data-options="required:true" /></td>
					</tr>
					<tr>
						<td>密码</td>
						<td><input id="input-text" type="password" name="password"
							class="easyui-validatebox" data-options="required:true" /></td>
					</tr>
					<tr>
						<td>确认密码</td>
						<td><input id="input-text" type="password" name="repassword"
							class="easyui-validatebox" data-options="required:true" /></td>
					</tr>
					<tr>
						<td>性别</td>
						<td>男<input type="radio" name="sex" value="男"
							checked="checked" /> 女<input type="radio" name="sex" value="女" />
						</td>
					</tr>
					<tr>
						<td>生日</td>
						<td><input id="input-text" type="text" name="birthday"
							class="easyui-datebox" data-options="required:true" /></td>
					</tr>
					<tr>
						<td>地址</td>
						<td><input id="input-text" type="text" name="address"
							class="easyui-validatebox" data-options="required:true" /></td>
					</tr>
					<tr>
						<td colspan="2" id="form-button"><input type="submit"
							id="reg-button" value="注&nbsp;册" /></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<!-- E 注册 -->

</body>
</html>