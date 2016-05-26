<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>省市级联</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/ProvincialMunicipalLeague.js"></script>
</head>
<body>
	<h2 style="text-align: center;">省市级联</h2>
	<center>
		省：<select id="province">
			<option>请选择...</option>
			<c:forEach var="province" items="${provinces}">
				<option value="${province.id}">${province.proName}</option>
			</c:forEach>
		</select> &nbsp;&nbsp;&nbsp; 市：<select id="city">
			<option>请选择...</option>
		</select> &nbsp;&nbsp;&nbsp; 区：<select id="district">
			<option>请选择...</option>
		</select>
	</center>
</body>
</html>