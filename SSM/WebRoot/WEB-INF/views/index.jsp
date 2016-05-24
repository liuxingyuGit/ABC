<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
</head>
<script type="text/javascript">
	function buyItems(){
		// 购买提交form
		document.itemsForm.action="${pageContext.request.contextPath}/items/userGoods";
		document.itemsForm.submit();
	}	
</script>
<body>
	<c:if test="${user.userRoot == 0}">
		${user.username}&nbsp; 管理员，您好：
	</c:if>
	<c:if test="${user.userRoot == 1}">
		${user.username}&nbsp; 用户，您好：
	</c:if>
	<br>
	<br>
	<form name="itemsForm" action="" method="post">
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<c:if test="${user.userRoot == 0}">
					<th>选择</th>
				</c:if>
				<th>商品编号</th>
				<th>名称</th>
				<th>价格</th>
				<th>生产日期</th>
				<th>详细描述</th>
				<th>购买</th>
			</tr>
			<c:forEach items="${itemsList}" var="its">
				<tr>
					<c:if test="${user.userRoot == 0}">
						<td><input type="checkbox" name="items_id" value="${its.id}" /></td>
					</c:if>
					<td>${its.id}</td>
					<td>${its.name}</td>
					<td>${its.price}</td>
					<td><fmt:formatDate value="${its.createtime}"
							pattern="yyyy-MM-dd HH:mm:ss" /></td>
					<td>${its.detail}</td>
					<td><input type="checkbox" name="items_id" value="${its.id}" /></td>
				</tr>
			</c:forEach>
			<tr style="text-align:center;">
				<td colspan="6">
					<button onclick="buyItems()">提交购买</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>