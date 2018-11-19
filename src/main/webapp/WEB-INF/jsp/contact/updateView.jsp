<%-- 
    Document   : updateView
    Created on : Nov 19, 2018, 7:33:17 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Atualizar contato</title>
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
            <div class="card mt-4" style="width: 50%; margin: auto;">
                <h3 class="card-title mt-4 ml-3">
                    Atualizar Contato
                </h3>
                <div class="card-body">
                    <form action="${pageContext.request.contextPath}/contato/atualizar" method="post">
                        <input type="hidden" name="contact.code" value="${contact.code}">
                        <div class="form-group">
                            <label>Nome:</label>
                            <input class="form-control" type="text" name="contact.name"
                                   value="${contact.name}"/>                
                        </div>
                        <div class="form-group">
                            <label>Telefone:</label>
                            <input class="form-control" type="text" name="contact.phoneNumber"
                                   value="${contact.phoneNumber}"/>
                        </div>
                        <div class="form-group">
                            <label>Rua:</label>
                            <input class="form-control" type="text" name="contact.address.street" 
                                   value="${contact.address.street}"/>
                        </div>
                        <div class="form-group">
                            <label>Número:</label>
                            <input class="form-control" type="text" name="contact.address.number" 
                                   value="${contact.address.number}"/>
                        </div>
                        <div class="form-group">
                            <label>CEP:</label>
                            <input class="form-control" type="text" name="contact.address.zipCode" 
                                   value="${contact.address.zipCode}"/>
                        </div>
                        <button class="btn btn-primary" type="submit">Atualizar</button>                
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
