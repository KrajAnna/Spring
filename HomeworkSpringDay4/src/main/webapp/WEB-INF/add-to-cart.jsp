<%--
  Created by IntelliJ IDEA.
  User: anna
  Date: 4/28/24
  Time: 10:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Shopping</title>
</head>
<body>
<c:choose>
    <c:when test="${isPresent}">
        Produkt ${product} został dodany do koszyka.
    </c:when>
    <c:otherwise>
        Produkt o id ${id} nie został znaleziony
    </c:otherwise>
</c:choose>
</body>
</html>
