package com.springbook.biz.board;

import java.util.List;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

public class BoardServiceClient {
	
	public static void main(String[] args) {
		
		BoardDAO boardDAO = new BoardDAO();
		
		BoardVO vo = new BoardVO();
		vo.setTitle("myBatis title");
		vo.setWriter("writer");
		vo.setContent("myBatis content");
		boardDAO.insertBoard(vo);
		
		vo = new BoardVO();
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		for (BoardVO board : boardList) {
			System.out.println(">>> " + board.toString());
		}
	}
}
