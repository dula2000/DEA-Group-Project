<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
<link rel="stylesheet" href="staffGrade1/Sdash1.css">
<link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
</head>
<body>
   <nav>
       <div class=logo-name>
           <div class="logo-image">
             <img src="staffGrade1/bird.jpg" alt="">
           </div>
           <span class="logo-name">Phoenix Airline</span>
       </div>
       
       <div class="menu-items">
         <ul class="nav-links">
             <li><a href="#">
                 <i class="uil uil-estate"></i>
                 <span class="link-name">Dashboard</span>
             </a></li>
              <li><a href="#">
                 <i class="uil uil-house-user"></i>
                 <span class="link-name">User Dashboard</span>
             </a></li>
              <li><a href="#">
               <i class="uil uil-plane"></i>
                 <span class="link-name">Flights</span>
             </a></li>
              <li><a href="#">
                 <i class="uil uil-ticket"></i>
                 <span class="link-name">Tickets</span>
             </a></li>
         
         </ul>
         
         <ul class="logout-mod">
                 <li><a href="#">
                 <i class="uil uil-signout"></i>
                 <span class="link-name">SignOut</span>
             </a></li>
         </ul>
         
       </div>    
   </nav>
   
   
   
   <center>
		<h1>User Management</h1>
        <h2>
        	<a href="new">Add New User</a>
        	&nbsp;&nbsp;&nbsp;
        	<a href="list">List All Users</a>

        </h2>
	</center>
    <div align="center">
		<c:if test="${user != null}">
			<form action="update" method="post">
        </c:if>
        <c:if test="${user == null}">
	
        </c:if>
        <form action="insert" method="post">
        <table border="1" cellpadding="5">
            <caption>
            	<h2>
            		<c:if test="${user != null}">
            			Edit User
            		</c:if>
            		<c:if test="${user == null}">
            			Add New User
            		</c:if>
            	</h2>
            </caption>
        		<c:if test="${user != null}">
        			<input type="hidden" name="id" value="<c:out value='${user.id}' />" />
        		</c:if>            
            <tr>
                <th>User Name: </th>
                <td>
                	<input type="text" name="name" size="45"
                			value="<c:out value='${user.name}' />"
                		/>
                </td>
            </tr>
            <tr>
                <th>User Email: </th>
                <td>
                	<input type="text" name="email" size="45"
                			value="<c:out value='${user.email}' />"
                	/>
                </td>
            </tr>
            <tr>
                <th>Country: </th>
                <td>
                	<input type="text" name="country" size="15"
                			value="<c:out value='${user.country}' />"
                	/>
                </td>
            </tr>
            <tr>
            	<td colspan="2" align="center">
            		<input type="submit" value="Save" />
            	</td>
            </tr>
        </table>
     </form>
    </div>	
   
</body>
</html>