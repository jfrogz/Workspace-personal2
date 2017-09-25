<%--
  Created by IntelliJ IDEA.
  User: NS-015
  Date: 25/09/2017
  Time: 03:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PostLogin</title>
</head>
<body>
    <h1>Esto es le postlogin.jsp</h1>
    <br>
    <p>
    <% out.println("Tu usuario es: " + request.getParameter("usuario"));
        %>
    <br>
    <%= "Tu contraseña es: " + request.getParameter("contrasena")%>

</body>
</html>
