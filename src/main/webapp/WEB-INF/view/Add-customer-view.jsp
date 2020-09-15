<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
            
            
            <h3 style="text-align: center"> Add/Update New Customer </h3>
                  
                <form:form action="saveCustomer" modelAttribute="customer" method="POST">
                    <form:hidden path="id"/>
                    <table >
                   
                    <tbody >
                        
                        <tr>
                            <td >
                                 <label ><b>First Name:</b></label> </td>
                            <td> <form:input class="input1" path="firstName"/> </td>
                        </tr>
                        <tr>
                            <td> <label><b>Last Name:</b></label> </td>
                            <td> <form:input path="lastName"/> </td>
                        </tr>
                        <tr>
                            <td> <label><b>Email:</b></label> </td>
                            <td> <form:input path="email"/> </td>
                        </tr>
                        <tr>
                            <td> <span style="padding:40%"/> </td>
                            <td> <span/></td>
                        </tr>
                        <tr>
                            <td> <label></label> </td>
                            <td> <button type="submit" value="save" class="accent"> Save Customer</button> </td>
                        </tr>
                    </tbody>
                </table>
            </form:form>
            
            <form id="messageForm" name="messageForm"  >
                
                    <span style="padding-left:40%"></span>
                    <button type="submit" class="accent" onclick="window.location.href='${pageContext.request.contextPath}/customer/list'; return false;">Home Page</button>
                
            </form>
        </div>
    </div>
    
  </body>
  
</html>
