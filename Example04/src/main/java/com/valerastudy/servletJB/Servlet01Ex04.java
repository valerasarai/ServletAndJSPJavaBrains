package com.valerastudy.servletJB;

import org.apache.commons.io.FileUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(description = "Example 01", urlPatterns = "/servlet01")
public class Servlet01Ex04 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String contextPath = getServletContext().getRealPath("/");
        File file = new File(contextPath + "/error.html");
        String mess = FileUtils.readFileToString(file);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print(mess);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        HttpSession session = request.getSession();
        session.setAttribute("namw", name);
        session.setAttribute("password", password);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("You ar logged in system on current session with:</br>");
        out.print("Name is: " + name + ", and Pass is: " + password + "</br>");
        out.print("<a href=\"scripts\\jspFile1.jsp\">Tray session vars in JSP!</a>");


    }
}

