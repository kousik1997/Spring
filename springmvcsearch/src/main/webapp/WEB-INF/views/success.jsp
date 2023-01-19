<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>${student}</h2>

<h3>Name is ${student.name}</h3>
<h3>Id is ${student.id}</h3>
<h3>State is ${student.address.state}</h3>
<h3>City is ${student.address.city}</h3>
</body>
</html>