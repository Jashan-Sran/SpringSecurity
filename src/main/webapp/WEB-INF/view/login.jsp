<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<html>
	<head>
		<title>Welcome</title>
	</head>
	<body>
		<c:if test="${param.error != null}">
		<i style="color: red"> Invalid UserName or Password </i>
		</c:if>
		<c:if test="${param.logout != null}">
		<i style="color: red"> You logged out successfully, Sign in again </i>
		</c:if>
		<div align="center">
		<h1>My custom login page</h1>
		<form:form action="/springSecurity/hello" method="get">
		
		UserName : <input type="text" name="username"/>
		
	
		
		Password : <input type="text" name="password"/>
		
		
		
		<input type="submit" value="Login">
		</form:form>
		
		</div>
		
	</body>
</html>