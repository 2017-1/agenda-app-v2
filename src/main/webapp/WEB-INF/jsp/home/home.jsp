<%-- 
    Document   : home.jsp
    Created on : Oct 31, 2018, 9:35:09 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página Inicial</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container">
                <div className="navbar-header">
                    <a href='/' class="navbar-brand">
                        Gerenciador de Contatos
                    </a>
                </div>
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/contato/novo">Novo</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/contato/listar">Listar</a>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="container">
            Página Inicial
        </div>
</html>
