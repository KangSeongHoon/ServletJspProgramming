package com.mycompany.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncondingFilter implements Filter{
	
	private String encoding;
@Override
public void init(FilterConfig filterConfig) throws ServletException {
	System.out.println("CharcterEncodingFilter init. run..");
	// TODO Auto-generated method stub
	encoding = filterConfig.getInitParameter("encoding"); 
}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//클라이언트가 요청하면 실행 
		//diFilter메서드를 쓸때 request response 공유객체와 함께 넘겨준다.
		
		//전처리
		request.setCharacterEncoding(encoding);
		//서블릿으로 이동 
		chain.doFilter(request, response);
	}

}
