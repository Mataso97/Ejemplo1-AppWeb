<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

    <head>
        <title>Ingreso de productos</title>
    </head>
    <body>

        <h1> Ingreso de producto </h1>
        <br/>

        <form action="productos" method="post">
            <p><label>Cedula: </label> <input type="text" name="cedula"> </p>
            <p><label>Nombre: </label> <input type="text" name="nombre"> </p>
            <p><label>Apellido: </label> <input type="text" name="apellido"> </p>
            <p><label>Telefono: </label> <input type="text" name="telefono"> </p>
            <button type="submit"> Enviar </button>
        </form>

        <br/>
        <h1> Ver lista de productos </h1>
        <br/>
        <p>Para ver información de otros productos dar clic a continuación</p>
        <form action="productos" method="get">
            <button type="submit"> Ver información</button>
        </form>
    </body>

</html>