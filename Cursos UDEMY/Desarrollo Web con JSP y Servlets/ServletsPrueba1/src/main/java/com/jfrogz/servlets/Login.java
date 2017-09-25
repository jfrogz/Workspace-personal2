package com.jfrogz.servlets;

import java.io.IOException;

public class Login extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            if(accion.equals("IniciarSesion")) {
                System.out.println("Tu usuario es: \t" + request.getParameter("usuario")
                + "\nTu constraseña es: \t" + request.getParameter("contrasena"));
            }
        } else {
            getServletContext().getRequestDispatcher("/jsp/index.jsp").forward(request, response);
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            if(accion.equals("inicio")) {
                getServletContext().getRequestDispatcher("/jsp/index.jsp").forward(request, response);
            }
            if(accion.equals("login")) {
                getServletContext().getRequestDispatcher("/jsp/login.jsp").forward(request, response);
            }
            if(accion.equals("IniciarSesion")) {
                getServletContext().getRequestDispatcher("/jsp/postLogin.jsp").forward(request, response);
            }
        } else {
            getServletContext().getRequestDispatcher("/jsp/index.jsp").forward(request, response);
        }
    }
}
