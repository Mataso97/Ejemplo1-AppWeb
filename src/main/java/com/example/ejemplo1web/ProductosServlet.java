package com.example.ejemplo1web;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import logica.ClaseProducto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@WebServlet(name = "productos", urlPatterns = {"/productos"})
public class ProductosServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();

        List<ClaseProducto> listaProductos = session.createQuery("FROM ClaseProducto ", ClaseProducto.class).getResultList();

        session.close();
        sessionFactory.close();

        HttpSession sesion = req.getSession();
        sesion.setAttribute("listaProductos", listaProductos);

        response.sendRedirect("tablaProductos.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cedula = req.getParameter("cedula");
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String telefono = req.getParameter("telefono");
        System.out.println("Este es el nombre: " + nombre);
    }


    public void destroy() {
    }
}