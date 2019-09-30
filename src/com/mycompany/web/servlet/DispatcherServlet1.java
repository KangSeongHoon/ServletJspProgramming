package com.mycompany.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet1 extends HttpServlet{
	private String x;
	private String y;
	

@Override
public void init(ServletConfig config) throws ServletException {
	System.out.println("init(Servletconfig) run...");
	x = config.getInitParameter("x");
	y = config.getInitParameter("y");
	
	System.out.println("전달받은 x값 : " +  x);
	System.out.println("전달받은 x값 : " +  y);
}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("DispatcherServlet service run...");
		int xValue = Integer.parseInt(x);
		int yValue =Integer.parseInt(y);
		int result = xValue + yValue;
		System.out.println("result :" + result);
	}
}
