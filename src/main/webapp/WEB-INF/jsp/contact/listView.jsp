<%-- 
    Document   : listView
    Created on : Nov 19, 2018, 6:40:43 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contatos - Lista</title>
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
                        <a class="nav-link" href="#">Novo</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Link</a>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="container">
            <form action="${pageContext.request.contextPath}/contato/buscar">
                <input type="name" name="contactName">
                <button type="submit">Buscar</button>
            </form>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>Número Tel.</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${contactList}" var="contact">
                        <tr>
                            <td>${contact.name}</td>
                            <td>${contact.phoneNumber}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/contato/detalhar/${contact.code}">Detalhar </a>
                                <a href="${pageContext.request.contextPath}/contato/remover/${contact.code}">Remover</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
