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
    <h1>Request</h1>
    <%="Tu usuario es:\t" + request.getAttribute("usuario")
    + "<br>Tu contraseña es\t" + request.getAttribute("contrasena")%>

    <h1>Sesion</h1>
    <%="Tu usuario es:\t" + session.getAttribute("usuario")
            + "<br>Tu contraseña es:\t" + session.getAttribute("contrasena")%>

    <h1>Request</h1>
    <%="Tu usuario es:\t" + application.getAttribute("usuario")
            + "<br>Tu contraseña es:\t" + application.getAttribute("contrasena")%>


</body>
</html>
