package com.crudappgenahm23.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

//@WebFilter(urlPatterns={"/firstServlet"})
public class TestFilter extends HttpFilter implements Filter 
{
	public void init(FilterConfig fConfig) throws ServletException 
	{
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		// Pre-Filteing--place your code here
		System.out.println("Pre-Filtering : TestFilter---doFilter()");

		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		// Post-Filteing--place your code here
		System.out.println("Post-Filtering : TestFilter---doFilter()");
	}
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() 
	{
	}
}