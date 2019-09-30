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
		//Ŭ���̾�Ʈ�� ��û�ϸ� ���� 
		//diFilter�޼��带 ���� request response ������ü�� �Բ� �Ѱ��ش�.
		
		//��ó��
		request.setCharacterEncoding(encoding);
		//�������� �̵� 
		chain.doFilter(request, response);
	}

}
