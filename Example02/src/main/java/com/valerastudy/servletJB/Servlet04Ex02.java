package com.valerastudy.servletJB;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(description = "Example 04", urlPatterns = "/servlet04")
public class Servlet04Ex02 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String mes1 = request.getParameter("mes1");
        String mes2 = request.getParameter("mes2");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Parametrul 1: " + mes1);
        out.println("</br>");
        out.println("Parametrul 2: " + mes2);
    }
}
