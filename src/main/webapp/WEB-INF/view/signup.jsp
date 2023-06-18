<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>SignUp Here !!</h1>

<form:form action="process-signup" method="POST" modelAttribute="signupDto">


   Username : <form:input path="username"/>
   
   <br>
   
   Password : <form:password path="password"/>
    <br>
    
    <input type="submit" value="signup">
</form:form>
</div>
</body>
</html>