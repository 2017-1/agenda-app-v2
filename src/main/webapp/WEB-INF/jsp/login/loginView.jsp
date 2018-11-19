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
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: #e9eaee;">  
        <h3 class="text-center mt-5">
            Agenda APP - Login
        </h3>
        <div style="margin:auto; width: 25%;">
            <div class="login-box p-4 mt-5" style="background-color: #fff">
                <form action="logar" method="post">
                    <div class="form-group">
                        <label>Usuário</label>
                        <input class="form-control" type="text" name="username"/>
                    </div>
                    <div class="form-group">
                        <label>Senha</label>
                        <input  class="form-control" type="password" name="password"/>
                    </div>
                    <p></p>
                    <button class="btn btn-success" type="submit">Entrar</button>
                </form>
            </div>
        </div>
    </body>
</html>
