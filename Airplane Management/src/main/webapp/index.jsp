<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Airplane Reservation Management</title>
<%@include file="AllComponent/allCSS.jsp"%>
</head>
<body>

        <% 
     if(session.getAttribute("name")==null){
    	 response.sendRedirect("login.jsp");
     }
    %>
    
</body>
</html>