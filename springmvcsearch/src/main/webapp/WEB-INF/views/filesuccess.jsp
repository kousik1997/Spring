<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isElIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File Uploaded Result</title>
</head>
<body>
<h1>upload file successful</h1>

<h1>${msg}</h1>
<img alt="profile image" src="<c:url value="/resources/image/${filename}" />">
</body>
</html>