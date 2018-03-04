package com.springbook.biz.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

//Data Access Object
@Repository
public class BoardDAOSpring4 {

	@Autowired
	private SqlSessionTemplate mybatis;

	// CRUD ����� �޼ҵ� ����
	// �� ���
	public void insertBoard(BoardVO vo) {
		System.out.println("===> BoardDAOSpring4 - Spring JDBC�� insertBoard ó��");
		mybatis.insert("BoardDAO.insertBoard", vo);
	}

	// �� ����
	public void updateBoard(BoardVO vo) {
		System.out.println("===> BoardDAOSpring4 - Spring JDBC�� updateBoard ó��");
		mybatis.update("BoardDAO.updateBoard", vo);
	}

	// �� ����
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> BoardDAOSpring4 - Spring JDBC�� deleteBoard ó��");
		mybatis.delete("BoardDAO.deleteBoard", vo);
	}

	// �� �� ��ȸ
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> BoardDAOSpring4 - Spring JDBC�� getBoard ó��");
		return mybatis.selectOne("BoardDAO.getBoard", vo);
	}

	// �� ��� ��ȸ
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> BoardDAOSpring4 - Spring JDBC�� getBoardList ó��");
		return mybatis.selectList("BoardDAO.getBoardList", vo);
	}
}

