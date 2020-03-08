package com.ssooya.toy.common.security;


import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

// 로그인 에러 처리 핸들러
public class LoginFailureHandler implements AuthenticationFailureHandler {




	@Override
	public void onAuthenticationFailure(HttpServletRequest req, HttpServletResponse res, AuthenticationException exception) throws IOException, ServletException {

//       로그인 정보 저장
		String userName = req.getParameter("username");
		String password = req.getParameter("password");








	}
}
