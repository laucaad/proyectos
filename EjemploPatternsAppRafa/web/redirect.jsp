<%--
Views should be stored under the WEB-INF folder so that
they are not accessible except through controller process.

This JSP is here to provide a redirect to the dispatcher
servlet but should be the only JSP outside of WEB-INF.
--%>
<%@page import="pojo.Customer"%>
<%@page import="java.util.List"%>
<%@page import="Facade.CustomerFacade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--%  response.sendRedirect("index.htm");  %-->

<html>
    <head><title>Listado de clientes</title></head>
    <body>
        <h1>Clientes</h1>
        
        <%
            CustomerFacade customerFacede = new CustomerFacade();
            List<Customer> customers = customerFacede.getListaClientes();
        %>
        <% 
            for(Customer c: customers){
        %>
        <p><%= c.getName() %></p>
        <% } %>
    </body>
</html>