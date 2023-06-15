<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<title>Welcome</title>
	</head>
	<body>
		
		<div align="center">
		<h1>My custom login page</h1>
		<form:form>
		
		UserName : <input type="text" name="username"/>
		
	
		
		Password : <input type="text" name="password"/>
		
		
		
		<input type="submit" value="Login">
		</form:form>
		
		</div>
		
	</body>
</html>