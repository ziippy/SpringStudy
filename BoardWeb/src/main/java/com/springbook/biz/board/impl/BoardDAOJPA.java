package com.springbook.biz.board.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

//Data Access Object
@Repository
public class BoardDAOJPA {

	@PersistenceContext
	private EntityManager em;

	// CRUD
	public void insertBoard(BoardVO vo) {
		System.out.println("===> BoardDAOJPA - JPA insertBoard");
		em.persist(vo);
	}

	public void updateBoard(BoardVO vo) {
		System.out.println("===> BoardDAOJPA - JPA updateBoard");
		em.merge(vo);
	}

	public void deleteBoard(BoardVO vo) {
		System.out.println("===> BoardDAOJPA - JPA deleteBoard");
		em.remove(em.find(BoardVO.class, vo.getSeq()));
	}

	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> BoardDAOJPA - JPA getBoard");
		return (BoardVO)em.find(BoardVO.class, vo.getSeq());
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> BoardDAOJPA - JPA getBoardList");
		return em.createQuery("from BoardVO b order by b.seq desc").getResultList();
	}
}

