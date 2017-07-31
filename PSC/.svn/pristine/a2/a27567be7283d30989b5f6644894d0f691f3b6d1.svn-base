<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<nav>
    <div style="width: 100%;" align="center">
    <img class="logo" src="${pageContext.request.contextPath}/resources/images/xpd_logo.png">
    </div>
    <br/><br/>
    <ul id="menu">
        <li><a href="${pageContext.request.contextPath}/">Home</a></li>
        <sec:authorize access="hasRole('ADMIN')">
            <li><a href="${pageContext.request.contextPath}/admin">Admin</a></li>
        </sec:authorize>
       <li><a href="${pageContext.request.contextPath}/products">Products</a></li>
       <li><a href="${pageContext.request.contextPath}/contactus">Contact Us</a></li>
       <li><a href="" onclick="$( '#formOut' ).submit();">Logout</a>
	       <form action="./logout" method="post" id="formOut">
	               <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	               <!-- <input type="submit" value="Salir"/> -->
	       </form>
	       </li>
    </ul>
</nav>