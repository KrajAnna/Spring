<%--
  Created by IntelliJ IDEA.
  User: anna
  Date: 4/7/24
  Time: 12:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Zad3</title>
</head>
<body>
<h1>Tabela: </h1>
<h1>Size: ${rows} X ${cols}</h1>
<c:forEach var="row" begin="1" end="${rows}">
    <p><c:forEach var="col" begin="1" end="${cols}">
        <c:out value="${row * col} "/>
    </c:forEach> </p>
</c:forEach>


</body>
</html>
