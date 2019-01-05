package com.ang.back.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import com.ang.back.config.JWTFactory;

public class JWTFilter extends GenericFilterBean{

	private JWTFactory jwtf = new JWTFactory();
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		String uri = req.getRequestURI();
		if(uri.indexOf("login")==-1) {
			String id = req.getHeader("X-AUTH-ID");
			String tokken = req.getHeader("X-AUTH-TOKEN");
			if(id==null || tokken==null) {
				throw new ServletException("너 이녀석!! 토큰값 확인하라고!!");
			}
			try {
				jwtf.verifyJWT(id, tokken);
			} catch (Exception e) {
				throw new ServletException("너 이녀석!! 토큰값 확인하라고!!");
			}
		}
		chain.doFilter(request, response);
	}	
}
