<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
	<form:form action="add" method="POST" modelAttribute="sp">
		Ma LSP:
		<form:input type="number"  placeholder="Ma LSP" path="malsp" />
		Ten SP:
		<form:input type="text"  placeholder="Ten SP" path="tensp" />
		don gia:
		<form:input type="number"  placeholder="don gia" path="dongia" />
		so luong:
		<form:input type="number"  placeholder="so luong" path="soluong" />
		Khuyen mai:
		<form:input type="number"  placeholder="Khuyen mai" path="khuyenmai" />
		Mo ta:
		<form:input type="text"  placeholder="Mo ta" path="mota" />
		Hinh anh:
		<form:input type="file"  value="Hinh anh" path="hinhanh" />
		<input type="submit" value="create">
	</form:form>
</body>
</html>