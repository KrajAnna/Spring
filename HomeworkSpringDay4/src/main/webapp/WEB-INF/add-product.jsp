<%--
  Created by IntelliJ IDEA.
  User: anna
  Date: 4/28/24
  Time: 11:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Product</title>
</head>
<body>
<form method="POST">
    <div>
        <label for="product">Produkt:</label>
        <input type="text" id="product" name="product" required>
    </div>
    <div>
        <label for="price">Cena:</label>
        <input type="text" id="price" name="price" required>
    </div>
    <div>
        <button type="submit">Dodaj produkt</button>
    </div>
</form>
</body>
</html>
