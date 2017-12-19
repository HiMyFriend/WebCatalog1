<%@ page import="Servlets.checkIn" %>
<%@ page import="JClass.WebCatalog" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: pashi
  Date: 16.11.2017
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WebCatalog: CheckIn</title>
</head>
<body style="min-width: 1000px; background: #ffb7da">
<form action="/" method="get">
    <p>
        <label>Имя</label>
        <input type="text" name="first_name" required>
    </p>
    <p>
        <label>Фамилия</label>
        <input type="text" name="last_name" required>
    </p>
    <p>
        <label>Email</label>
        <input type="email" name="email" required>
    </p>
    <p>
        <label>Телефон</label>
        <input type="tel" name="phone" required>
    </p>
    <p>
        <label>Пароль</label>
        <input type="password" name="password" required>
    </p>
    <p>
    <form>
        <button name="registry" type="submit">
            Зарегистрироваться
        </button>
    </form>
    </p>
</form>
</body>
</html>
