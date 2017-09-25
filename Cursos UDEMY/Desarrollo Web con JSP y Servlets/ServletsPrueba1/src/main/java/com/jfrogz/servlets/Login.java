package com.jfrogz.servlets;

import javax.ejb.SessionContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Login extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            if(accion.equals("IniciarSesion")) {
                String usuario = request.getParameter("usuario");
                String contrasena =  request.getParameter("contrasena");

                //request
                request.setAttribute("usuario", usuario);
                request.setAttribute("contrasena", contrasena);

                //sesion
                HttpSession sesion = request.getSession();
                sesion.setAttribute("usuario", usuario);
                sesion.setAttribute("contrasena", contrasena);

                //contexto
                ServletContext context = this.getServletContext();
                context.setAttribute("usuario", usuario);
                context.setAttribute("contrasena", contrasena);

                getServletContext().getRequestDispatcher("/jsp/postLogin.jsp").forward(request, response);
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
