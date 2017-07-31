<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<nav>
   <sec:authorize access="hasRole('ADMIN')">
    	<h1>Admin page</h1>
		<div class="square">
		  <h2>Tienes privilegios de administrador</h2>
		  <p>blah blah ...</p>
		  <p>blah blah ...</p>
		</div>
	</sec:authorize>
	<sec:authorize access="!hasRole('ADMIN')">
    	¡Área restringida, no tienes acceso a este recurso!
	</sec:authorize>
</nav>