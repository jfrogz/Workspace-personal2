package com.jfrogz;

import java.io.IOException;

public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String accion = request.getParameter("accion");
        if(accion != null){

        }else {
            getServletContext().getRequestDispatcher("/jsp/index.jsp").forward(request, response);
        }
    }
}
