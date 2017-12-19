<%@ page import="JClass.WebCatalog" %>
<%--
  Created by IntelliJ IDEA.
  User: pashi
  Date: 11.11.2017
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <title>WebCatalog.com</title>
</head>
<body style="min-width: 1000px; max-width: 2000px; background: #ffb7da">
<div style="height: 80px" >
    <div style="float: left; width: 70%;">
        <h1 align="center" style="color:rgb(2,3,5)">WebCatalog</h1>
    </div>
    <div style="float: left; width: 20%">
        <input name="search" type="text" placeholder="Поиск по товарaм..." >
        <a href="jspIn/profile.jsp" >Вход и регестрация</a>
    </div>
    <div style="float: left; width: 9%">
        <input type="submit" value="Поиск">
    </div>
</div>
<div>
    <hr>
</div>
</body>
</html>