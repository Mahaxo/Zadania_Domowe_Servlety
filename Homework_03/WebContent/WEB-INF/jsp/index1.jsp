<%@	taglib	uri="http://java.sun.com/jsp/jstl/core"	prefix="c"%>

<c:if test="${not empty param.author}" > 
Wybrany autor <c:out value="${param.author}"></c:out>
</c:if>
<c:if test="${empty param.author}" >
Brak parametru!
</c:if>
<br>
<<a	href='<c:url value="/ServletJsp61"/>'	>Zadanie 6!</a>
