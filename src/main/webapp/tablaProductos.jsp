<%@ page import="java.util.List" %>
<%@ page import="logica.ClaseProducto" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mostrar productos</title>
</head>
<body>
    <%
        String hola;
        List<ClaseProducto> listaProductos = (List) request.getSession().getAttribute("listaProductos");
        int contador = 1;
        for (ClaseProducto product : listaProductos){
    %>
    <p><b>Producto N° <%=contador%> </b></p>
    <p>Nombre: <%=product.getNombre()%></p>
    <p>Unidades: <%=product.getUnidades()%></p>
    <p>Costo: <%=product.getCosto()%></p>
    <p>***************************************</p>
    <%contador++;%>
    <% }%>
</body>
</html>
