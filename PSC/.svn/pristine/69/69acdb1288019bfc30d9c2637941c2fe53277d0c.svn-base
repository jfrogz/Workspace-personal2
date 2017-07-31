<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 
<html>
 
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
    
    <title><tiles:getAsString name="title" /></title>
    <%-- <link href="<c:url value='/static/css/bootstrap.css' />"  rel="stylesheet"></link> --%>
    <spring:url value="./resources/css/app.css" var="appCssUrl"/>
    <%-- <link href="<c:url value='${ appCssUrl }' />" rel="stylesheet"></link> --%>
    <link href="${ appCssUrl }" rel="stylesheet"></link>
</head>
  
<body>
    <div class="container-fluid">
    
        <header id="header">
            <tiles:insertAttribute name="header" />
        </header>
     
        <section id="sidemenu">
            <tiles:insertAttribute name="menu" />
        </section>
             
        <section id="site-content">
            <tiles:insertAttribute name="body" />
        </section>
         
        <footer id="footer">
            <tiles:insertAttribute name="footer" />
        </footer>

    </div>
</body>
</html>