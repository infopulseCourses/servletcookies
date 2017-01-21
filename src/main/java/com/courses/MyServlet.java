package com.courses;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/name-handler")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookie = req.getCookies();
        String name = null;
        if (cookie != null) {
            for (Cookie cook : cookie) {
                if (cook.getName().equals("name")) {
                    name = cook.getValue();
                }
            }
        }

        if(name == null){
            name =   req.getParameter("name");
            Cookie cook = new Cookie("name",name);
            cook.setMaxAge(5);
            resp.addCookie(cook);
        }

        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<html><body>");
        writer.println("<h2>" + name + "</h2>");
        writer.print("</body></html>");
        writer.close();
    }
}
