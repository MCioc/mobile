package com.oracle.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.vo.Operator;

/**
 * Servlet Filter implementation class Login
 */
public class Login implements Filter {
    List list=new ArrayList();
    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		
		Operator oper=(Operator)req.getSession().getAttribute("oper");
		String uri=req.getRequestURI();
		String path=req.getContextPath();
		uri=uri.replaceAll(path, "");
		System.out.println(uri);
		
		if(oper!=null){
			chain.doFilter(request, response);
		}else if(list.contains(uri)){
			chain.doFilter(request, response);
		}else{
			res.sendRedirect("index.jsp");
		}	
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		list.add("/index.jsp");
		list.add("/login.do");
		list.add("/logout.jsp");
		list.add("/login.jsp");
	}

}
