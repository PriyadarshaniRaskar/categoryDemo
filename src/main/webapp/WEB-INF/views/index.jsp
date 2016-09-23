<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:url value="/resources/css" var="css"/>
<spring:url value="/resources/js" var="js"/>

<html>
<head>
<%@include file="./shared/header.jsp" %>
</head>
<body>
<%@include file="./shared/menubar.jsp" %>

<!-- home -->
<c:if test="${isHomeClicked ==true }">
<%@include file="home.jsp" %>
</c:if>

<c:if test="${isCategoryView ==true }">
<%@include file="category.jsp" %>
</c:if>


</body>
</html>
