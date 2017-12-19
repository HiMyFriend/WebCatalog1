<%--
  Created by IntelliJ IDEA.
  User: pashi
  Date: 17.12.2017
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddProduct</title>
</head>
<body style="min-width: 1000px; background: #ffb7da">
<form>
    <h1 align="center"> Добавление товара. </h1>
    <hr>
</form>
<form action="/addProduct" method="get">
    <p>
        <label>Имя</label>
        <input type="text" name="name" required>
    </p>
    <p>
        <label>Цена</label>
        <input type="text" name="price" required>
    </p>
    <p>
    <form>
        <button name="add" type="submit">
            Добавить товар.
        </button>
    </form>
    </p>
</form>
</body>
</html>
