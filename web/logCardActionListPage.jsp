<%-- 
    Document   : logCardActionListPage
    Created on : 2/jul/2021, 11:50:53
    Author     : mfernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TimeSheet - Lista Batidas de Ponto</title>
    </head>
    <body>
        <h1>Lista Batidas de Ponto</h1>${lista.size()}
        <table border="1" cellpadding="5">
            <caption><h2>List of users</h2></caption>
            <tr>
                <th>N CARTAO</th>
                <th>NOME</th>
                <th>DISPOSITIVO</th>
                <th>ACCAO</th>
                <th>DATA</th>
                <th>IMGAGEM</th>
            </tr>
            <c:forEach var="log" items="${lista}">
                <tr>
                    <td><c:out value="${log.logCardActionPK.idCard}" /></td>
                    <td><c:out value="${log.idEmployee.idEmployee}" /></td>
                    <td><c:out value="${log.idDevice.description}" /></td>
                    <td><c:out value="${log.idAction.description}" /></td>
                    <td><c:out value="${log.logCardActionPK.datetime}" /></td>
                    <td><c:out value="${log.imageFile}" /></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
