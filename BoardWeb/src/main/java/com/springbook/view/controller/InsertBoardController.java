package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
//public class InsertBoardController implements Controller {
public class InsertBoardController {

	//@Override
	//public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
	//public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
	
	@RequestMapping(value="/insertBoard.do")
	//public void insertBoard(HttpServletRequest request) {
	//public void insertBoard(BoardVO vo) {
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		
		/*
		//1. 사용자 입력 정보 추출
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		// 2. DB 연동 처리
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setContent(content);
		*/
		
		//BoardDAO boardDAO = new BoardDAO();
		boardDAO.insertBoard(vo);
		
		// 3. 화면 네비게이션
		//response.sendRedirect("getBoardList.do");
		//return "getBoardList.do";
		
		//ModelAndView mav = new ModelAndView();
		//mav.setViewName("redirect:getBoardList.do");
		//return mav;
		
		return "redirect:getBoardList.do";
	}

}
