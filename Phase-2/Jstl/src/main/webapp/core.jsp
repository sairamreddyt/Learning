<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Value:<c:out value="${400*5 }"></c:out><br>
<c:set var="income" value="${6*4000}"></c:set>
Value:<c:out value="${income }"></c:out><br>

<c:catch var="error">
  <%int x=10/0; %>
</c:catch>
<c:if test="${error!=null }">
     ${error }<br>
</c:if>
<c:choose>
     <c:when test="${income>=24000 }">
            can manage
     </c:when>

    <c:otherwise>
               Difficult to manage
    </c:otherwise>
</c:choose>
</body>
</html>