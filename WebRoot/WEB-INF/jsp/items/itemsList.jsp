<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'itemsList.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<form action="${PageContext.request.ContextPath }/items/queryItems.action" method="post">
		<table border="1">
			<tr>
				<td><input type="text" name="itemsCustomer.items_name"></td>
				<td><input type="submit" value="搜索商品"></td>
			</tr>
		</table>

		<h3>商品列表</h3>
		<table border="1" width="100%">
			<tr>
				<td>商品名称</td>
				<td>商品价格</td>
				<td>生成时间</td>
				<td>商品描述</td>
				<td>修改商品</td>
				<td>删除商品</td>
			</tr>
			<c:forEach items="${itemsList}" var="item">
				<tr>
					<td>${item.items_name }</td>
					<td>${item.items_price }</td>
					<td><fmt:formatDate value="${item.items_creattime }" pattern="yyyy:MM:dd HH:mm:ss"/></td>
					<td>${item.items_detail }</td>

					<td><a
						href="${PageContext.request.ContextPath }/items/editItems.action?id=${item.id}">修改</a></td>
					<td><a
						href="${PageContext.request.ContextPath }/items/deleteItems.action?id=${item.id}">删除</a></td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>
