package com.wangzunbin.springbootdemo.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName:LoginFilter  <br/>
 * Funtion: ${TODD} <br/>
 *
 * @author WangZunBin <br/>
 * @version 0.4 2019/4/17 14:59   <br/>
 */
@WebFilter(urlPatterns = "/api/*", filterName = "loginfilter")
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("loginfilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("loginfilter doFilter");
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        HttpServletResponse resp = (HttpServletResponse)servletResponse;
        String username = req.getParameter("username");
        if("xdclass".equals(username)) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
//            resp.sendRedirect("index.html");
            return;
        }
    }

    @Override
    public void destroy() {
        System.out.println("loginfilter destroy");

    }
}
