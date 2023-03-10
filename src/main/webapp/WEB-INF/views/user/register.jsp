<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	${ TrangThai }
	<form:form action="register" method= "POST" modelAttribute="TK">
		Email:
		<form:input type="email"  placeholder="email" path="email" />
		Mat khau:
		<form:input type="password"  placeholder="password" path="matkhau" />
		Ho ten:
		<form:input type="text"  placeholder="ho ten" path="tenkh" />
		Dia chi:
		<form:input type="text"  placeholder="dia chi" path="diachi" />
		SDT:
		<form:input type="number"  placeholder="so dien thoai" path="sdt" />
		<input type="submit" value="Dang ky">
	</form:form>
</body> 
</html>