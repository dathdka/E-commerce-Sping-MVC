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
	<form:form action="updatecate" method="POST" modelAttribute="lsp">
		<form:input type="hidden"  placeholder="${sp.malsp}" path="malsp"  />
		Ten LSP:
		<form:input type="text"  placeholder="${sp.tenlsp}" path="tenlsp"  />
		<input type="submit" value= "update">
	</form:form>
</body>
</html>