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
    <title>List of products in your cart</title>
</head>
<body>
<c:forEach items="${cartItems}" var="item">
<p>
<c:out value="${item.product}"/>: <c:out value="${item.quantity}"/> zł
</p>
</c:forEach>
</body>
</html>
