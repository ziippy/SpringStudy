package com.springbook.biz.board;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class BoardServiceClient 
{
    public static void main( String[] args )
    {
        // EntityManager
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAProject");
    	EntityManager em = emf.createEntityManager();
    	
    	// Transaction
    	EntityTransaction tx = em.getTransaction();
    	try {
    		// Transaction
    		tx.begin();
    		
    		Board board = new Board();
    		board.setTitle("JPA title");
    		board.setWriter("admin");
    		board.setContent("JPA content");
    		em.persist(board);
    		
    		// 목록 조회
    		String jpql = "select b from Board b order by b.seq desc";
    		List<Board> boardList = em.createQuery(jpql, Board.class).getResultList();
    		for (Board brd : boardList) {
    			System.out.println("---> " + brd.toString());
    		}
    		
    		// Transaction 커밋
    		tx.commit();
    	} catch (Exception e) {
    		e.printStackTrace();
    		// Transaction 롤백
    		tx.rollback();
    	} finally {
			em.close();
		}
    	
    	emf.close();
    }
}
