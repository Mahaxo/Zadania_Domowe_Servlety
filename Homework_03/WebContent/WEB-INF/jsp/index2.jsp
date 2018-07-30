<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@	taglib	uri="http://java.sun.com/jsp/jstl/core"	prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};%>
<c:forEach var="number" begin="1" end="9" step="2" items="<%=numbers%>" >
<c:out value="${number}"/> <br>
</c:forEach>
</body>
</html>