<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
	<form:form action="addcate" method="POST" modelAttribute="lsp">
		<form:input type="text"  placeholder="Ten LSP" path="tenlsp" />
		<input type="submit" value = "Tao moi">
	</form:form>
</body>
</html>