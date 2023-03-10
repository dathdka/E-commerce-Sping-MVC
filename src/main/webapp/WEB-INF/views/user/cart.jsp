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
	<c:forEach var="item" items="${ giohang }">
		<h4>${ item.tensp }</h4>
		<c:if test="${item.khuyenmai>0}">
			<h2 style="color:orange">${ item.dongia - (item.dongia *item.khuyenmai)/100}</h2>
			
		</c:if>
		<c:if test="${item.khuyenmai==0}">
			<h4>${item.dongia}</h4>
		</c:if>
		<img src="<c:url value="/assets/user/img/${item.hinhanh}"/>" />
		<a href="removecart/${item.masp }">
			<button>Xoa khoi gio</button>
		</a>
	</c:forEach>
	<br>
	<h1>Tong Tien = ${ tong }</h1>
	<a href="checkout">
		<button>Thanh toan</button>
	</a>
	
</body>
</html>