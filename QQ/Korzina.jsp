<%@ page import="java.io.PrintWriter" %>
<%@ page import="JClass.WebCatalog" %><%--
  Created by IntelliJ IDEA.
  User: pashi
  Date: 17.12.2017
  Time: 0:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WebCatalog: Korzina</title>
</head>
<body style="min-width: 1000px; background: #ffb7da">

<%  PrintWriter writer = response.getWriter();
    Cookie[] cookies = request.getCookies();
    int id = Integer.parseInt(cookies[1].getValue());
    boolean flag = true;
    int res = 0;
    writer.println("<h1>Your korzina. </h1>\n" +
            "    <hr>");
    for(int i = 0; i < WebCatalog.client.get(id).basket.size(); i++){
        flag = false;
        writer.println("<h3>Product: " + WebCatalog.client.get(id).basket.get(i).name + "</h3>");
        writer.println("Price:" + WebCatalog.client.get(id).basket.get(i).price);
        res = res + WebCatalog.client.get(id).basket.get(i).price;
    }
     if(flag){
        writer.println("<h1>Productov net</h1>");
     }
    writer.println("<h2> Itog:" + res + "</h2>");
%>
</body>
</html>
