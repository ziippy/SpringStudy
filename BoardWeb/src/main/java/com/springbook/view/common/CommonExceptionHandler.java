package com.springbook.view.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice("com.springbook.view")
public class CommonExceptionHandler {

	@ExceptionHandler(ArithmeticException.class)
	public ModelAndView handleArithmeticException(Exception e) {
		System.out.println("ArithmeticException");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", e);
		mav.setViewName("error.jsp");
		
		return mav;
	}
	
	@ExceptionHandler(NullPointerException.class)
	public ModelAndView handleNullPointerException(Exception e) {
		System.out.println("NullPointerException");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", e);
		mav.setViewName("error.jsp");
		
		return mav;
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception e) {
		System.out.println("Exception");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", e);
		mav.setViewName("error.jsp");
		
		return mav;
	}
}
