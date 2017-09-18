package com.valerastudy.servletJB;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(description = "Example 03", urlPatterns = "/servlet03")
public class Servlet03Ex02 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String message = request.getParameter("message");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(message);
    }
}
