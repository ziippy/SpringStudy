package com.springbook.biz.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

//Data Access Object
@Repository
public class BoardDAOSpring3 extends SqlSessionDaoSupport {

	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	// CRUD
	public void insertBoard(BoardVO vo) {
		System.out.println("===> BoardDAOSpring3 - Spring JDBC insertBoard");
		getSqlSession().insert("BoardDAO.insertBoard", vo);
	}

	public void updateBoard(BoardVO vo) {
		System.out.println("===> BoardDAOSpring3 - Spring JDBC updateBoard");
		getSqlSession().update("BoardDAO.updateBoard", vo);
	}

	public void deleteBoard(BoardVO vo) {
		System.out.println("===> BoardDAOSpring3 - Spring JDBC deleteBoard");
		getSqlSession().delete("BoardDAO.deleteBoard", vo);
	}

	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> BoardDAOSpring3 - Spring JDBC getBoard");
		return getSqlSession().selectOne("BoardDAO.getBoard", vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> BoardDAOSpring3 - Spring JDBC getBoardList");
		return getSqlSession().selectList("BoardDAO.getBoardList", vo);
	}
}

