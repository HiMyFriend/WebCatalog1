<%--
  Created by IntelliJ IDEA.
  User: pashi
  Date: 19.11.2017
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WebCatalog: profile</title>
</head>
<body style="min-width: 1000px; background: #ffb7da">
    <div>
        <form method="get" action="/login">
            <h1 align="center">Вход</h1>
            <hr>
            <p align="center">
                <input type="text" name="email" required placeholder="Электронная почта">
            </p>
            <p align="center">
                <input type="password" name="password" required placeholder="Пароль">
            </p>
            <hr>
            <p align="center">
                <form method="get" action="/login">
                    <input type="submit" value="Войти" style="width: 150px; height: 25px;">
                </form>
            </p>
            <p align="center">
                <a href="registration.jsp" >Регистрация</a>
            </p>
        </form>
    </div>
</body>
</html>