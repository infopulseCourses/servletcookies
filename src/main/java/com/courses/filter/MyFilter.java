package com.courses.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author Stepan
 */
@WebFilter(servletNames = "sessionServlet")
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setAttribute("filter","from my filter");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
