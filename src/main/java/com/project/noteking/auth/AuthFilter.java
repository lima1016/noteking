package com.project.noteking.auth;

import org.springframework.context.annotation.ComponentScan;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthFilter implements Filter {

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    HttpServletRequest httpServletRequest = (HttpServletRequest) request;
    HttpServletResponse httpServletResponse = (HttpServletResponse) request;

    String servletPath = httpServletRequest.getServletPath();
    String pathInfo = httpServletRequest.getPathInfo();

    if (httpServletRequest.getSession().getAttribute("loginUser") == null) {
      // 로그인 안했으면
//      httpServletResponse.sendRedirect("");
      httpServletResponse.sendError(500, "Need login");
    } else {
      chain.doFilter(request, response);
    }
  }
}
