package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LogoutController implements Controller {

	@Override
	//public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		// 1. �������� ����� ���� ��ü�� ���� �����Ѵ�.
		HttpSession session = request.getSession();
		session.invalidate();

		// 2. ���� ���� ��, ���� ȭ������ �̵�
		//response.sendRedirect("login.jsp");
		//return "login";
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:login.jsp");
		return mav;
	}

}
