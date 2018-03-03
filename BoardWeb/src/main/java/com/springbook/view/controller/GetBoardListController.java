package com.springbook.view.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

//public class GetBoardListController implements Controller {
@Controller
public class GetBoardListController {

	//@Override
	//public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
	//public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		
		/*
		// 1. 사용자 입력 정보 추출
		// 2. DB 연동 처리
		BoardVO vo = new BoardVO();
		BoardDAO boardDAO = new BoardDAO();
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		*/
		
		// 3. 검색 결과를 세션에 저장하고 목록 화면으로 이동한다.
		/*
		HttpSession session = request.getSession();
		session.setAttribute("boardList", boardList);
		//response.sendRedirect("getBoardList.jsp");
		return "getBoardList";
		*/
		
		// 3. 검색 결과를 세션에 저장하고 목록 화면으로 이동한다. (스프링 Controller 이용 시)
		/*
		ModelAndView mav = new ModelAndView();
		mav.addObject("boardList", boardList);
		mav.setViewName("getBoardList");
		return mav;
		*/
		
		mav.addObject("boardList", boardDAO.getBoardList(vo));
		mav.setViewName("getBoardList.jsp");
		return mav;
	}

}
