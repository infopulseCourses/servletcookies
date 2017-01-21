package com.courses;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String name = req.getParameter("name");
      resp.setContentType("text/html");

      PrintWriter writer = resp.getWriter();
      writer.println("<html><body>");
      writer.println(name);
      writer.print("</body></html>");
      writer.close();
    }
}
