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
		// 1. �˻��� �Խù� ��ȣ ����
		String seq = request.getParameter("seq");

		// 2. DB ���� ó��
		BoardVO vo = new BoardVO();
		vo.setSeq(Integer.parseInt(seq));
		
		BoardDAO boardDAO = new BoardDAO();
		BoardVO board = boardDAO.getBoard(vo);
		*/
		
		// 3. �˻� ����� ���ǿ� �����ϰ� ��� ȭ������ �̵��Ѵ�.
		/*
		HttpSession session = request.getSession();
		session.setAttribute("board", board);
		//response.sendRedirect("getBoard.jsp");
		return "getBoard";
		*/
		
		// 3. �˻� ����� ���ǿ� �����ϰ� ��� ȭ������ �̵��Ѵ�. (������ Controller �̿� ��)
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
