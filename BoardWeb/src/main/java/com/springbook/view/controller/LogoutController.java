package com.springbook.view.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//public class LogoutController implements Controller {
@Controller
public class LogoutController {

	//@Override
	//public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
	//public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		
		/*
		HttpSession session = request.getSession();
		session.invalidate();
		*/

		//response.sendRedirect("login.jsp");
		//return "login";
		
		/*
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:login.jsp");
		return mav;
		*/
		
		session.invalidate();
		return "redirect:login.do";
	}

}
