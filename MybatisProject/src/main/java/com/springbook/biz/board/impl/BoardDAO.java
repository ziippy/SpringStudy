package com.springbook.biz.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.util.SqlSessionFactoryBean;

//Data Access Object
@Repository
public class BoardDAO {

	private SqlSession mybatis;
	
	public BoardDAO() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	
	// CRUD 기능의 메소드 구현
	// 글 등록
	public void insertBoard(BoardVO vo) {
		System.out.println("===> mybatis로 insertBoard 처리");
		mybatis.insert("BoardDAO.insertBoard", vo);
		mybatis.commit();
	}

	// 글 수정
	public void updateBoard(BoardVO vo) {
		System.out.println("===> mybatis로 updateBoard 처리");
		mybatis.update("BoardDAO.updateBoard", vo);
		mybatis.commit();
	}

	// 글 삭제
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> mybatis로 deleteBoard 처리");
		mybatis.delete("BoardDAO.deleteBoard", vo);
		mybatis.commit();
	}

	// 글 상세 조회
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> mybatis로 getBoard 처리");
		return (BoardVO)mybatis.selectOne("BoardDAO.getBoard", vo);
	}

	// 글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> mybatis로 getBoardList 기능 처리");
		return mybatis.selectList("BoardDAO.getBoardList", vo);
	}
}
