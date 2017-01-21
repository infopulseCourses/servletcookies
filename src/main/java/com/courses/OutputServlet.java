package com.courses;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Stepan
 */
@WebServlet(urlPatterns = "/output-servlet")
public class OutputServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String name = (String) session.getAttribute("name");

        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<html><body>");
        writer.println("<h2>" + name + "</h2>");
        writer.print("</body></html>");
        writer.close();

    }
}
