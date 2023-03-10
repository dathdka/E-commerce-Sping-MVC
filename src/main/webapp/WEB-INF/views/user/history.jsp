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
	
	<c:forEach  var="item" items="${ list }">
		<h1>${ item.thoigiandat }</h1>
		<h1>${ item.tongtien }</h1>
		<a href="historydetail/${item.maddh }">
			<button>Xem chi tiet</button>
		</a>
	</c:forEach>
</body>
</html>