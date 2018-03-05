package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.board.impl.BoardService;

public class BoardServiceClient {
	
	public static void main(String[] args) {
		
		// 1. Spring 컨테이너 구동
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring 컨테이너로부터 BoardServiceImpl 객체를 Lookup
		BoardService boardService = (BoardService)container.getBean("boardService");
		
		// 3. 글 등록 기능 테스트
		BoardVO vo = new BoardVO();
		vo.setTitle("임시 제목");
		vo.setWriter("홍길동");
		vo.setContent("블라블라디보스톡");
		//boardService.insertBoard(vo);
		
		// 4. 글 목록 검색 기능
		vo = new BoardVO();
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for (BoardVO board : boardList) {
			System.out.println(board.toString());
		}
		
		// 5. 컨테이너 종료
		container.close();
	}
}
