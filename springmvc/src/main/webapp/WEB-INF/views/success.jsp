<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 class="text-center">${Header}</h3>
	<p class="text-center">${Desc}</p>
<h1>welcome ${user.userName}</h1>
<h2>your emailaddress is ${user.email}</h2>
<h3>your passwor is ${user.password}</h3>

</body>
</html>