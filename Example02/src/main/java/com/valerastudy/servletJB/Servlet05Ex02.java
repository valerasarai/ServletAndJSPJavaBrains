package com.valerastudy.servletJB;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(description = "Example 05", urlPatterns = "/servlet05")
public class Servlet05Ex02 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String mes1 = request.getParameter("message");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Parametrul GET din FORM: " + mes1);
    }
}
