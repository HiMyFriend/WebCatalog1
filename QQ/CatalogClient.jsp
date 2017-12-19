<%@ page import="java.io.PrintWriter" %>
<%@ page import="JClass.WebCatalog" %>
<%@ page import="JClass.Client" %><%--
  Created by IntelliJ IDEA.
  User: pashi
  Date: 07.12.2017
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Client</title>
</head>
<body style="min-width: 1000px; background: #ffb7da">
<div style="float: right; width: 20%">
    <form action="/korzina" method="get">
        <input type="submit" name="Korzina" value="Korzina" />
    </form>
</div>

<%
    Client n = (Client) request.getAttribute("client");
    PrintWriter writer = response.getWriter();
    writer.println("<h1>Hello, " + n.first_name + "</h1>");
    writer.println("<hr>");
    for(int i = 0; i < WebCatalog.products.size(); i++){
        writer.println("<h3>Product: " + WebCatalog.products.get(i).name + "</h3>");
        writer.println("Price:" + WebCatalog.products.get(i).price);
        writer.println("<form>\n" +
                        "<input type=\"button\" value=\"Купить\" onClick='location.href=\"korzinaadd?name=" +
                            WebCatalog.products.get(i).name + "&price=" + WebCatalog.products.get(i).price +"\"'>" +
                "       </form>");
    }
%>


</body>
</html>
