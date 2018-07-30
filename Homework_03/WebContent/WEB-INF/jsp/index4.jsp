<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@	taglib	uri="http://java.sun.com/jsp/jstl/core"	prefix="c"%>
<%@ taglib 	uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<jsp:useBean id="date" class="java.util.Date" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<fmt:formatDate value="${date}" pattern="YYYY/MM/dd" />
<c:set var="Amount" value="99.14115" />
<p> <fmt:formatNumber value="${Amount}" maxFractionDigits="3" /> </p>
<p> <fmt:formatNumber value="${Amount}" minFractionDigits="5" /> </p>
<p> <fmt:formatNumber value="${Amount}" type="percent" /> </p>
<p> <fmt:formatNumber value="${Amount}" minFractionDigits="3" /> zł </p>

</body>
</html>