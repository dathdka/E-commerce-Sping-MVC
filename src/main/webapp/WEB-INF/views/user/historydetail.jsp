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
	<c:forEach  var="item" items="${ list }">
		<h1>Ten SP: ${ item.sp.getTensp() }</h1>
		<h1>So luong mua: ${ item.sluong }</h1>
		<h1>Thanh tien: ${ item.tongtien }</h1>
	</c:forEach>
</body>
</html>