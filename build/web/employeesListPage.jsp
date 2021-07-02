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
        <style>
            .dropbtn {
                background-color: #3498DB;
                color: white;
                padding: 16px;
                font-size: 16px;
                border: none;
                cursor: pointer;
            }

            /* Dropdown button on hover & focus */
            .dropbtn:hover, .dropbtn:focus {
                background-color: #2980B9;
            }

            /* The container <div> - needed to position the dropdown content */
            .dropdown {
                position: relative;
                display: inline-block;
            }

            /* Dropdown Content (Hidden by Default) */
            .dropdown-content {
                display: none;
                position: absolute;
                background-color: #f1f1f1;
                min-width: 160px;
                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
                z-index: 1;
            }

            /* Links inside the dropdown */
            .dropdown-content a {
                color: black;
                padding: 12px 16px;
                text-decoration: none;
                display: block;
            }

            /* Change color of dropdown links on hover */
            .dropdown-content a:hover {background-color: #ddd}

            /* Show the dropdown menu (use JS to add this class to the .dropdown-content container when the user clicks on the dropdown button) */
            .show {display:block;}
        </style>
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
                <th>ACCAO</th>
            </tr>
            ${lista.size()}
            <c:forEach var="e" items="${lista}">
                <tr>
                    <td><c:out value="${e.idEmployee}" /></td>
                    <td><c:out value="${e.employeeName}" /></td>
                    <td><c:out value="" /></td>
                    <td><c:out value="${e.ws}" /></td>
                    <td>
                        <form action="LogCardActionController">
                            <input type="hidden" name="idEmployee" value="${e.idEmployee}"/>
                            <input type="submit" value="Ver Batida de Ponto"/>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <form action="employeesInsertPage.jsp"><button type="submit">Adicionar Novo Funcionario</button> </form>
        
    </body>
</html>
