package com.valerastudy.servletJB.Ex01;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(description = "Second Servlet!", urlPatterns = "/servlet")
public class SecondServlet extends HttpServlet {
    private String responseTemplate =
            "<html>" +
                    "<body>" +
                        "<h2>It is servlet initiated with annotation!</h2>"+
                    "</body>" +
            "</html>";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.process(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.process(request, response);
    }

    private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setStatus(200);
        response.getWriter().print(responseTemplate);
    }
}