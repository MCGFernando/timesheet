<%-- 
    Document   : newjspemployeesListPage
    Created on : 1/jul/2021, 22:32:33
    Author     : maro.fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TimeSheet - Employees</title>
    </head>
    <body>
        <h1>Lista de Funcionários</h1>
        <form action="employeesInsertPage.jsp"><button type="submit">Adicionar Novo Funcionario</button> </form>
        
        <table border="1" cellpadding="5">
            <caption><h2>List of users</h2></caption>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>SAP</th>
                <th>WS</th>
            </tr>
            ${lista.size()}
            <c:forEach var="e" items="${lista}">
                <tr>
                    <td><c:out value="${e.idEmployee}" /></td>
                    <td><c:out value="${e.employeeName}" /></td>
                    <td><c:out value="" /></td>
                    <td><c:out value="${e.ws}" /></td>
                </tr>
            </c:forEach>
        </table>
        <form action="employeesInsertPage.jsp"><button type="submit">Adicionar Novo Funcionario</button> </form>
    </body>
</html>
