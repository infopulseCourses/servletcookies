<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="myteg" uri="/WEB-INF/tld/myteglib.tld" %>
<html>
<head>
    <title>Output</title>
</head>

<body>
<h2>JSP page</h2>
<%@include file="newJsp.jsp" %>
<myteg:welcome name="Vasya">Oleg</myteg:welcome>
<div><c:out value="JSTL out"/></div>
<c:if test="${sessionScope.name != null}">
    <div>${sessionScope.name} not null</div>
</c:if>
<c:choose>
    <c:when test="${sessionScope.name != null}">
        <div>Choose not null</div>
    </c:when>
    <c:otherwise>
        <div>Choose null</div>
    </c:otherwise>
</c:choose>
<c:forEach var="element" items="${requestScope.list}">
    <div><c:out value="${element}"/></div>
</c:forEach>
</body>

</html>
