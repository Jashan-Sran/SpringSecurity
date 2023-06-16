<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<html>
	<head>
		<title>Welcome</title>
	</head>
	<body>
		<h1>Hello World.</h1>
		<p> this hello world from controller !!</p>
		
		<form:form action="logout" method="POST">
		    <input type="submit" value="logout">
		</form:form>
		
		
	</body>
</html>