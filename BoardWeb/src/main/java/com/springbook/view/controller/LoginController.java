package com.springbook.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

//public class LoginController implements Controller {
@Controller
public class LoginController {

	//@Override
	//public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
	//public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
	@RequestMapping("/login.do")
	public String login(UserVO vo, UserDAO userDAO) {
		
		/*
		// 1. ����� �Է� ���� ����
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		// 2. DB ���� ó��
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		
		UserDAO userDAO = new UserDAO();
		UserVO user = userDAO.getUser(vo);
		*/
		
		// 3. ȭ�� �׺���̼�
		/*
		if (user != null) {
			//response.sendRedirect("getBoardList.do");
			return "getBoardList.do";
		} else {
			//response.sendRedirect("login.jsp");
			return "login";
		}
		*/
		
		// 3. ȭ�� �׺���̼� - ������ Controller �̿� ��
		/*
		ModelAndView mav = new ModelAndView();
		if (user != null) {
			mav.setViewName("redirect:getBoardList.do");
		} else {
			mav.setViewName("redirect:login.jsp");
		}
		return mav;
		*/
		
		if (userDAO.getUser(vo) != null) {
			return "redirect:getBoardList.do";
		} else {
			return "redirect:login.jsp";
		}
	}

}
