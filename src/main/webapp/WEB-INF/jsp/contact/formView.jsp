<%-- 
    Document   : formView
    Created on : Nov 1, 2018, 7:28:21 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Novo Contato</h1>
        ${contact}
         <form action="contato/salvar" method="post">
            <div>
                <label>Nome:</label>
                <input type="text" name="contact.name"/>                
            </div>
            <div>
                <label>Telefone:</label>
                <input type="text" name="contact.phoneNumber" />
            </div>
<!--            <div>
                <label>Rua:</label>
                <input type="text" name="contact.address.street" />
            </div>
            <div>
                <label>Número:</label>
                <input type="text" name="contact.address.number" />
            </div>
            <div>
                <label>CEP:</label>
                <input type="text" name="contact.address.zipCode" />-->
            </div>
            <button type="submit">Salvar</button>                
        </form>
    </body>
</html>
