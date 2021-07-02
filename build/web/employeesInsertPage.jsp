<%-- 
    Document   : employeesInsertPage
    Created on : 2/jul/2021, 1:43:00
    Author     : maro.fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TimeSheet - Cadastro de Funcionários</title>
    </head>
    <body>
        <h1>Cadastro de Funcionários</h1>
        <form action="EmployeesController">
            ID<br><input type="number" name="idEmployee" value="${e}" placeholder="" required/><br>
            Nome<br><input type="text" name="employeeName" min="3" value="${e}" placeholder="Digite o Nome do Funcionário" required/><br>
            SAP<br><input type="text" name="sAPCCName" value="${e}" placeholder="Digite a área do Funcionário"/><br>
            WS<br><input type="text" name="ws" value="${e}" placeholder="Digite o Tipo de Horário Funcionário"/><br>
            Nº CARTÃO<br><input type="text" name="idCard" value="${e}" placeholder="Digite o Nº do Cartão NFC"/><br>
            ESTADO DO CARTÃO<br>
            <select name="idCardState">
                <option value="1" selected>Cartão Activo</option>
                <option value="2">Cartão Desactivo</option>
            </select><br>
            DESCRICAO<br><textarea name="description"></textarea><br>
            <input type="hidden" name="action" value="insert"/>
            <input type="submit">
            <input type="reset">
        </form>
    </body>
</html>
