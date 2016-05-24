<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>用户登录</title>
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
}

html {
	height: 100%;
}

body {
	background: url(img/bg.jpg) no-repeat center fixed;
	background-size: cover;
}

#box {
	width: 30%;
	height: 26%;
	margin: 18% auto;
}

#title {
	color: white;
	font-style: oblique;
	font-family: "sans-serif";
}
</style>
</head>

<body>
	<div id="box" class="container">
		<h1 class="text-center" id="title">系统登录</h1>
		<form method="post" action="user/userLogin">
			<div class="form-group">
				<div class="col-md-12">
					<input type="text" class="form-control required" name="id"
						placeholder="请输入用户名" /><br /> <input type="password"
						class="form-control required" name="password" placeholder="请输入密码" /><br />
					<button class="btn btn-primary btn-lg col-md-12" type="submit">登
						陆</button>
					<a style="display:block;margin-top:16px;" href="${pageContext.request.contextPath}/register.jsp"
						class="btn btn-primary btn-lg col-md-12" type="button">注册</a>
				</div>
			</div>
		</form>
	</div>
	<script type="text/javascript">
		$(function() {
			$("form").submit(function() {

				if ($("#username").val() == "") {
					return false;
				}
				if ($("#username").val() == "") {
					return false;
				}
				return true;
			});
		});
	</script>
</body>
</html>
