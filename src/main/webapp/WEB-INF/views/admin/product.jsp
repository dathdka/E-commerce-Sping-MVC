<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>san pham</title>
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
	<a href= "addproduct">
		<button>Them SP</button>
	</a>
	<c:forEach var="item" items="${ list }">
		<h4>Ma SP: ${ item.masp }</h4>
		<h4>Ma LSP ${ item.malsp }</h4>
		<h4>Ten SP:  ${ item.tensp }</h4>
		<h4>Don gia: ${item.dongia}</h4>
		<h4>So luong:  ${ item.soluong }</h4>
		<h4>mo ta:  ${ item.mota }</h4>
		<img src="<c:url value="/assets/user/img/${item.hinhanh}"/>" />
		<a href="/DiamonShop/admin/updateproduct/${ item.masp }">
			<button>Cap nhat</button>
		</a>
	</c:forEach>
</body>
</html>