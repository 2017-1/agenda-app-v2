<%-- 
    Document   : loginView
    Created on : Nov 5, 2018, 7:16:42 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Login</h2>
        <form action="logar" method="post">
            <input type="text" name="username"/>
            <input type="password" name="password"/>
            <button type="submit">Entrar</button>
        </form>
    </body>
</html>
