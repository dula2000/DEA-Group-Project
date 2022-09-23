<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- Change the location if you want -->
    
    <%
     if(session.getAttribute("name")==null){
    	 response.sendRedirect("login.jsp");
     }
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Airplane Reservation Management</title>
<%@include file="AllComponent/allCSS.jsp"%>
</head>
<body>
    
    <%@include file="AllComponent/navigation.jsp" %>
     
</body>
</html>