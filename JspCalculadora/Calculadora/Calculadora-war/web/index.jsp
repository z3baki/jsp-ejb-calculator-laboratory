<%-- 
    Document   : jspCalculator
    Created on : Apr 16, 2023
    Author     : SebastianV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./calcservlet" method="POST"> 
                <td><input type="text" name="t1" /> </td> 
                <td><input type="text" name="t2" /></td>
            <input type="submit" name="action" value="SUMA" />
            <input type="submit" name="action" value="RESTAR" />
            <input type="submit" name="action" value="MULTIPLICAR" />            
            <input type="submit" name="action" value="DIVIDIR" />
            <input type="submit" name="action" value="MODULO" />
            <input type="submit" name="action" value="CUADRADO" />
        </form> 
    </body>
</html>
