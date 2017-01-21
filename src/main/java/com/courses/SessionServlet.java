package com.courses;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Stepan
 */
@WebServlet(urlPatterns = "/session")
public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);

        String name = (String) session.getAttribute("name");
        if(name == null){
            name = req.getParameter("name");
            session.setAttribute("name", name);
        }

        RequestDispatcher rd = req.getRequestDispatcher("/output-servlet");
        rd.forward(req, resp);

    }

}
