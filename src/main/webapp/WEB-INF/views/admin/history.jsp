<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
		<h1>Ma DDH: ${item.maddh }</h1>
		<h1>IDUser: ${ item.iduser }</h1>
		<h1>Thoi gian dat: ${ item.thoigiandat }</h1>
		<h1>Tong tien: ${ item.tongtien }</h1>
		<a href="historydetail/${item.maddh }">
			<button>Xem chi tiet</button>
		</a>
	</c:forEach>
</body>
</html>