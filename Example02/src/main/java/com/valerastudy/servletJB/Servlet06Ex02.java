package com.valerastudy.servletJB;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(description = "Example 06", urlPatterns = "/servlet06")
public class Servlet06Ex02 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String mes1 = request.getParameter("message");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Parametrul POST: " + mes1);
    }
}
