<%-- 
    Document   : Usuariosdato
    Created on : 22 abr. 2023, 14:37:30
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos de Usuario</title>
    </head>
    <body>
        <h1>Datos del Usuario</h1>
        <form> 
             <label for="id">Id: </label> <%= request.getAttribute("id")%>
             <br><br>
            <label for="nombre">Nombre: </label> <%= request.getAttribute("nombre")%>
            <br><br>
            <label for="email">Email: </label> <%= request.getAttribute("email")%>
            <br><br>
             <label for="nacionalidad">Nacionalidad: </label> <%= request.getAttribute("nacionalidad")%>
        </form>
        
        
       
    </body>
</html>
