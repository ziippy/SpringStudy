package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

public class LogoutController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		// 1. �������� ����� ���� ��ü�� ���� �����Ѵ�.
		HttpSession session = request.getSession();
		session.invalidate();

		// 2. ���� ���� ��, ���� ȭ������ �̵�
		//response.sendRedirect("login.jsp");
		return "login";
	}

}
