<%--
  Created by IntelliJ IDEA.
  User: anna
  Date: 4/28/24
  Time: 11:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List of products</title>
</head>
<body>
<c:forEach items="${products}" var="p">
<p>
<c:out value="${p.name}"/>: <c:out value="${p.price}"/> zł
</p>
</c:forEach>
</body>
</html>
