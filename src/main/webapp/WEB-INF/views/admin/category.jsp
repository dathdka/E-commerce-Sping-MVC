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
	<a href="addcategory">
		<button>Them LSP</button>
	</a>
	<c:forEach var="item" items="${ list }">
		<p>${item.malsp } - ${item.tenlsp } 
		<a href="updatecate/${ item.malsp }">
			<button>Cap nhat lsp</button>
		</a></p>
	</c:forEach>
</body>
</html>