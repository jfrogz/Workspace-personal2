<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:c="http://java.sun.com/jsp/jstl/core">
<head>
    <c:if test="${ empty param.lang }">
        <fmt:setLocale value="es" scope="session"/>
    </c:if>
    <c:if test="${ not empty param.lang }">
        <fmt:setLocale value="${ param.lang }" scope="session"/>
    </c:if>

    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- bajar librerias para no acceder a ellas remotamente y evitar xss -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title>XPD-WEB-PSC</title>

    <!-- <link href="./resources/css/app.css" rel="stylesheet"></link> -->

    <style>
        .login {
            /*float: left;*/
            margin: center;
            padding: 15px;
            max-width: 400px;
            height: 300px;
            border: 1px solid black;
        }

        td {
            padding-top: 25px;
            padding-left: 5px;
        }
    </style>


</head>
<body>
<div class="container-fluid" align="center">
    <h1>XPD Tu Factura</h1>
    <br/>
    <div class="login">
        <form action="./login" method="post">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <table>
                <c:if test="${param.error == 'true'}">
                    ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
                </c:if>
                <tr>
                    <td><spring:message code="login.username" text="Usuario"/>:</td>
                    <td><input type="text" id="username" name="username"/></td>
                </tr>
                <tr>
                    <td><spring:message code="login.password" text="Contraseņa"/>:</td>
                    <td><input type="password" id="password" name="password"/></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" id="send" name="send"
                               value='<spring:message code="login.send" text="Entrar"/>'/>
                    </td>
                </tr>
            </table>
        </form>
    </div>
    <br/>
    <c:set var="now" value="<%=new java.util.Date()%>"/>
    <fmt:formatDate type="both" dateStyle="long" timeStyle="short" value="${now}"/>

</div>
</body>
</html>