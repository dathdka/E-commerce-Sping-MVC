<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li><a href="./">
			<button>Home</button>
		</a></li>
		<li><a href="product">
			<button>Product</button>
		</a></li>
		<li><a href="history">
			<button>order</button>
		</a></li>
		<li><a href="category">
			<button>category</button>
		</a></li>
	</ul>
	<c:forEach var="item" items="${ list }">
		<h1>Ma DDH: ${ item.maddh }</h1>
		<h1>Ten SP: ${ item.sp.getTensp() }</h1>
		<h1>So luong: ${ item.sluong }</h1>
		<h1>Thanh tien: ${ item.tongtien }</h1>
	</c:forEach>
</body>
</html>