<%-- 
    Document   : usuario
    Created on : 19 abr. 2023, 21:19:07
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resgistro de Usuario</h1>
         <form action="<%= request.getContextPath()%>/UsuarioServlet" method="POST">
        <form>
            Id: <input type="text"name="id">
            <br>
            Nombre: <input type="text" name="nombre">
            <br>
            Email: <input type="email" name="email">
            <br>
             Nacionalidad: <input type="nacionalidad" name="nacionalidad">
             <br>
             <input type="submit" value="Registar"> 
             <br>
            </form>
            </body>
</html>
