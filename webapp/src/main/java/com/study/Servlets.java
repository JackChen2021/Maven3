package com.study;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author JackChern @create 2021-07-19 9:52
 */
public class Servlets extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.println("hello maven web");
        writer.flush();
        writer.close();
    }
}
