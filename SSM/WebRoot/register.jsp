<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加用户</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript">
	/* 检查用户名是否存在 */
	function checkUsername() {
		var $username = $("[name=username]").val().trim();
		if ($username != "") {
			var url = "user/existsName";
			$.post(url, {
				"username" : $username
			}, function(data) {
				if (data) {
					$("#msg").css("color", "green").html("用户名可以使用");
				} else {
					$("#msg").css("color", "red").html("用户名已存在");
				}
			});
		}else{
			$("#msg").css("color", "red").html("请输入用户名");	
		}
	}
</script>
</head>
<body>
	<h2>用户注册</h2>
	<form action="${pageContext.request.contextPath}/user/register" method="post">
		<table border="0" cellpadding="10" cellspacing="0"
			style="text-align: center;">
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="username" onblur="checkUsername()" /></td>
				<td><font id="msg"></font></td>
			</tr>
			<tr>
				<td>性别：</td>
				<td>男<input type="radio" checked="checked" name="sex" value="男" />
					女<input type="radio" name="sex" value="女" /></td>
				<td></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="password" /></td>
				<td><font id="pwd"></font></td>
			</tr>
			<tr>
				<td>生日：</td>
				<td><input type="text" name="birthday" /></td>
				<td><font id="birthday"></font></td>
			</tr>
			<tr>
				<td>地址：</td>
				<td><input type="text" name="address" /></td>
				<td><font id="address"></font></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="提交" /></td>
			</tr>
		</table>
	</form>
</body>
</html>