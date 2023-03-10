<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	${ TrangThai }
	<form:form action="login" method="POST" modelAttribute="TK">
		Email:
		<form:input type="email" placeholder="email" path="email" />
		Mat khau:
		<form:input type="password" placeholder="password" path="matkhau" />
		<input type="submit" value="Dang nhap">
	</form:form>	
</body>
</html>