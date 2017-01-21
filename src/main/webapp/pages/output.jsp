<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<%@ taglib prefix="myteg" uri="/WEB-INF/tld/myteglib.tld" %>
<html>
<head>
    <title>Output</title>
</head>

<body>
<h2>JSP page</h2>
<%@include file="newJsp.jsp"%>
<myteg:welcome name="Vasya">Oleg</myteg:welcome>
</body>

</html>
