package com.valerastudy.servletJB;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@WebServlet(description = "Example 01", urlPatterns = "/servlet01")
public class Servlet01Ex02 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.makeFile(response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.makeFile(response);
    }

    public void makeFile(HttpServletResponse response) throws IOException {
        String contextPath = getServletContext().getRealPath("/WEB-INF");

        File file = new File(contextPath + "/resources.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        FileWriter writer = new FileWriter(file);
        writer.write("Am incercat, da ce nu se poate!!!!!");
        writer.close();

        String path = file.getCanonicalPath();

        String reponseText = "<p>Asta-i o fignea!</p>"+
                "<p>Dar fisierul s-o creat. Uite-te <a href=\"" + path + "\">"+ path + "</a>.</p>";

        response.setStatus(200);
        response.getWriter().print(reponseText);
    }
}
