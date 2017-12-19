<%@ page import="java.io.PrintWriter" %>
<%@ page import="JClass.WebCatalog" %>
<%@ page import="JClass.Admin" %><%--
  Created by IntelliJ IDEA.
  User: pashi
  Date: 09.12.2017
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
</head>
<body style="min-width: 1000px; background: #ffb7da">

<%
    PrintWriter writer = response.getWriter();
    for(int i = 0; i < WebCatalog.products.size(); i++){
        writer.println("<form>");
        writer.println("<h3>Product: "  + WebCatalog.products.get(i).name + "</h3>");
        writer.println("Price:" + WebCatalog.products.get(i).price );
        writer.println("<form>\n" +
                "<input type=\"button\" value=\"Удалить товар\" onClick='location.href=\"/deleteProduct?name=" + WebCatalog.products.get(i).name + "&price=" + WebCatalog.products.get(i).price +"\"'>" +
                "       </form>");
        writer.println("</form>");
    }
    writer.println("<form>\n" +
            "<input type=\"button\" value=\"Добавить товар\" onClick='location.href=\"Catalogi/AddProduct.jsp\"''>" +
            "       </form>");
%>
</body>
</html>
