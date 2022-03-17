<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.jsp.Student" scope="session"></jsp:useBean>
<h3>get from the scope object</h3>
Id:<jsp:getProperty property="id" name="obj"/><br>
Name:<jsp:getProperty property="name" name="obj"/>
</body>
</html>