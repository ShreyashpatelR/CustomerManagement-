<%-- 
    Document   : list-customer-view
    Created on : Sep 12, 2020, 5:50:27 PM
    Author     : Shreyash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" 
      rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/css/main.css"/>
    </head>
    <body>
    
    <div id="chat-page">
        <div class="chat-container">
            <div class="chat-header">
                <h2 class="title">Customer Manager</h2>
            </div>
            
            <ul id="messageArea">
                <c:forEach var="tempCustomer" items="${customers}">
                    <li class = "chat-message">
                        <i style="background-color: rgb(33, 150, 243);">${tempCustomer.lastName.charAt(0)}</i>
                        <span>${tempCustomer.lastName}</span>
                        <p>${tempCustomer.firstName}</p>
                        <p>${tempCustomer.email}</p>
                        <form>
                            
                            <button type="submit"  class="primary" onclick="window.location.href='showFormForUpdate?customerId=${tempCustomer.id}'; return false;" > update </button>
                            <span style="padding-left:200px"></span> 
                            <button type="submit" class="primary" onclick="window.location.href='delete?customerId=${tempCustomer.id}'; return false;" > Delete </button>
                        </form>
                    </li>
                    
                </c:forEach>
                
            </ul>
            <form id="messageForm" name="messageForm">
                <div class="form-group">
                    <span style="padding-left:40%"></span>
                    <button type="submit" class="accent" onclick="window.location.href='showFormForAdd'; return false;">Add Customer</button>
                </div>
            </form>
        </div>
    </div>
    
  </body>
  
</html>
