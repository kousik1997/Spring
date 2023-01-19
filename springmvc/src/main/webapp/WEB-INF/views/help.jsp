<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>this is help page</h2>
</body>

<%
/* String name = (String) request.getAttribute("name");
Integer roll = (Integer) request.getAttribute("roll");
LocalDateTime time = (LocalDateTime) request.getAttribute("time"); */
%>

<h3>
	Heloo.... ${name}
	<%-- <%=name%> --%>
</h3>
<h3>
	your rollnumber is....${roll}
	<%-- <%=roll%> --%>
</h3>
<h4>
	Time is..${time}
	<%-- <%=time.toString()%> --%>
</h4>
	 <h5>marks is ${marks}</h5>
<hr>
<c:forEach var="item" items="${marks}">
	<h5>${item}</h5>
</c:forEach>

</html>