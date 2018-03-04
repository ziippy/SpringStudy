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

	// CRUD ����� �޼ҵ� ����
	// �� ���
	public void insertBoard(BoardVO vo) {
		System.out.println("===> BoardDAOSpring3 - Spring JDBC�� insertBoard ó��");
		getSqlSession().insert("BoardDAO.insertBoard", vo);
	}

	// �� ����
	public void updateBoard(BoardVO vo) {
		System.out.println("===> BoardDAOSpring3 - Spring JDBC�� updateBoard ó��");
		getSqlSession().update("BoardDAO.updateBoard", vo);
	}

	// �� ����
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> BoardDAOSpring3 - Spring JDBC�� deleteBoard ó��");
		getSqlSession().delete("BoardDAO.deleteBoard", vo);
	}

	// �� �� ��ȸ
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> BoardDAOSpring3 - Spring JDBC�� getBoard ó��");
		return getSqlSession().selectOne("BoardDAO.getBoard", vo);
	}

	// �� ��� ��ȸ
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> BoardDAOSpring3 - Spring JDBC�� getBoardList ó��");
		return getSqlSession().selectList("BoardDAO.getBoardList", vo);
	}
}

