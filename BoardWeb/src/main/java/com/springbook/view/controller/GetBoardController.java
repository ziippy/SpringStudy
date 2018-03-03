package com.springbook.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

//public class GetBoardController implements Controller {
@Controller
public class GetBoardController {

	//@Override
	//public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
	//public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
	@RequestMapping("/getBoard.do")
	public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		
		/*
		// 1. 검색할 게시물 번호 추출
		String seq = request.getParameter("seq");

		// 2. DB 연동 처리
		BoardVO vo = new BoardVO();
		vo.setSeq(Integer.parseInt(seq));
		
		BoardDAO boardDAO = new BoardDAO();
		BoardVO board = boardDAO.getBoard(vo);
		*/
		
		// 3. 검색 결과를 세션에 저장하고 목록 화면으로 이동한다.
		/*
		HttpSession session = request.getSession();
		session.setAttribute("board", board);
		//response.sendRedirect("getBoard.jsp");
		return "getBoard";
		*/
		
		// 3. 검색 결과를 세션에 저장하고 목록 화면으로 이동한다. (스프링 Controller 이용 시)
		/*
		ModelAndView mav = new ModelAndView();
		mav.addObject("board", board);
		mav.setViewName("getBoard");
		return mav;
		*/
		
		mav.addObject("board", boardDAO.getBoard(vo));
		mav.setViewName("getBoard.jsp");
		return mav;
	}

}
