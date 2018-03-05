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

	// CRUD 기능의 메소드 구현
	// 글 등록
	public void insertBoard(BoardVO vo) {
		System.out.println("===> BoardDAOJPA - JPA로 insertBoard 처리");
		em.persist(vo);
	}

	// 글 수정
	public void updateBoard(BoardVO vo) {
		System.out.println("===> BoardDAOJPA - JPA로 updateBoard 처리");
		em.merge(vo);
	}

	// 글 삭제
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> BoardDAOJPA - JPA로 deleteBoard 처리");
		em.remove(em.find(BoardVO.class, vo.getSeq()));
	}

	// 글 상세 조회
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> BoardDAOJPA - JPA로 getBoard 처리");
		return (BoardVO)em.find(BoardVO.class, vo.getSeq());
	}

	// 글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> BoardDAOJPA - JPA로 getBoardList 처리");
		return em.createQuery("from BoardVO b order by b.seq desc").getResultList();
	}
}

