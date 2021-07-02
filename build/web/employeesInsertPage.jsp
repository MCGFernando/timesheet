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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="" method="">
            ID<input type="number" name="idEmployee" value="${e}" placeholder="" required/>
            Nome<input type="text" name="employeeName" min="3" value="${e}" placeholder="" required/>
            SAP<input type="text" name="sAPCCName" value="${e}" placeholder=""/>
            WS<input type="text" name="ws" value="${e}" placeholder=""/>
            CARD<input type="text" name="card" value="${e}" placeholder=""/>
            <input type="submit">
            <input type="reset">
        </form>
    </body>
</html>
