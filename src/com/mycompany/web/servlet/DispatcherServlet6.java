package com.mycompany.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet6 extends HttpServlet{
	protected void doget(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("dispatcher 6 doget 실행");
		String title = request.getParameter("title");
		String conent = request.getParameter("content");
		
		request.setAttribute("title", title);
		request.setAttribute("connect", conent);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/dispatcher6.jsp");
		rd.forward(request, response);
	}
	protected void dopost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("dispatcher 6 dopost 실행");
		String title = request.getParameter("title");
		String conent = request.getParameter("content");
		
		request.setAttribute("title", title);
		request.setAttribute("connect", conent);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/dispatcher6.jsp");
		rd.forward(request, resp);
	}
	
	

}
