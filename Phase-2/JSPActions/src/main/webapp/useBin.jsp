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
<!-- call getter property -->
<h3>Value before setting a property</h3>
Id: <jsp:getProperty property="id" name="obj"/><br>
Name:<jsp:getProperty property="name" name="obj"/><br>
<!-- set property -->
<jsp:setProperty property="id" name="obj" value="66"/>
<jsp:setProperty property="name" name="obj" value="sai"/>
<h3>Value after Setting a property</h3>
Id:<jsp:getProperty property="id" name="obj"/><br>
Name:<jsp:getProperty property="name" name="obj"/><br>
<a href="nextpage.jsp">Access Request Bean</a>
</body>
</html>