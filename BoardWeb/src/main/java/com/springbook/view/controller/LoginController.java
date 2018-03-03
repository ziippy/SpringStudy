package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

public class LoginController implements Controller {

	@Override
	//public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		// 1. 사용자 입력 정보 추출
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		// 2. DB 연동 처리
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		
		UserDAO userDAO = new UserDAO();
		UserVO user = userDAO.getUser(vo);
		
		// 3. 화면 네비게이션
		/*
		if (user != null) {
			//response.sendRedirect("getBoardList.do");
			return "getBoardList.do";
		} else {
			//response.sendRedirect("login.jsp");
			return "login";
		}
		*/
		
		// 3. 화면 네비게이션 - 스프링 Controller 이용 시
		ModelAndView mav = new ModelAndView();
		if (user != null) {
			mav.setViewName("redirect:getBoardList.do");
		} else {
			mav.setViewName("redirect:login.jsp");
		}
		return mav;
	}

}
