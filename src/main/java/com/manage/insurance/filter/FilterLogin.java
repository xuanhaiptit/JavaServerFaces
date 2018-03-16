package com.manage.insurance.filter;

import java.io.IOException;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manage.insurance.bean.SessionUtils;

@WebFilter(filterName = "filterLogin", urlPatterns = "*.jsp")
public class FilterLogin implements Filter {

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        try {
            HttpServletRequest reqt = (HttpServletRequest) request;
            HttpServletResponse resp = (HttpServletResponse) response;
//            HttpSession ses = reqt.getSession(false);
//            HttpSession session = SessionUtils.getSession();
//            System.out.println("session = "+ses.getAttribute("userName"));
            resp.sendRedirect(reqt.getContextPath() + "/faces/view/jsp/MH01.jsf");
        } catch (Exception e) {
            System.out.println("ee " + e.getMessage());
        }
    }
    // @Override
    // public void doFilter(ServletRequest request, ServletResponse response,
    // FilterChain chain) throws IOException, ServletException {
    // System.out.println("qua filter1");
    // try {
    // System.out.println("qua filter2");
    // HttpServletRequest reqt = (HttpServletRequest) request;
    // HttpServletResponse resp = (HttpServletResponse) response;
    //// HttpSession ses = reqt.getSession(false);
    //// System.out.println("ss = "+ses.getAttribute("userName"));
    //// String reqURI = reqt.getRequestURI();
    //// if (ses != null && ses.getAttribute("userName") != null)
    //// chain.doFilter(request, response);
    //// else
    // String contextPath = ((HttpServletRequest) reqt).getContextPath();
    // System.out.println("qua filter3");
    // resp = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
    // System.out.println("qua filter4");
    //
    // ((HttpServletResponse) resp).sendRedirect(contextPath + "/view/jsp/MH01.jsp");
    //
    //// System.out.println("reqt.getContextPath() = "+reqt.getContextPath());
    //// resp.sendRedirect(reqt.getContextPath() + "/faces/view/jsp/MH01.jsp");
    // } catch (Exception e) {
    // System.out.println("ee = "+e.getMessage());
    // }
    // }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }

}
