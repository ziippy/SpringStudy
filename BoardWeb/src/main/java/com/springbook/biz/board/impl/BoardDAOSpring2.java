package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

//Data Access Object
@Repository
public class BoardDAOSpring2 {

	// SQL
	private final String BOARD_INSERT = "insert into board(seq, title, writer, content, cnt) values((select nvl(max(seq), 0)+1 from board), ?, ?, ?, 0)";
	private final String BOARD_UPDATE = "update board set title=?, content=? where seq=?";
	private final String BOARD_DELETE = "delete board where seq=?";
	private final String BOARD_GET = "select * from board where seq=?";
	private final String BOARD_LIST = "select * from board order by seq desc";
	private final String BOARD_LIST_T = "select * from board where title like '%'||?||'%' order by seq desc";
	private final String BOARD_LIST_C = "select * from board where content like '%'||?||'%' order by seq desc";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// CRUD
	public void insertBoard(BoardVO vo) {
		System.out.println("===> BoardDAOSpring2 - Spring JDBC insertBoard");
		jdbcTemplate.update(BOARD_INSERT, vo.getTitle(), vo.getWriter(), vo.getContent());
	}

	public void updateBoard(BoardVO vo) {
		System.out.println("===> BoardDAOSpring2 - Spring JDBC updateBoard");
		jdbcTemplate.update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
	}

	public void deleteBoard(BoardVO vo) {
		System.out.println("===> BoardDAOSpring2 - Spring JDBC deleteBoard");
		jdbcTemplate.update(BOARD_DELETE, vo.getSeq());
	}

	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> BoardDAOSpring2 - Spring JDBC getBoard");
		Object[] args = {vo.getSeq()};
		return jdbcTemplate.queryForObject(BOARD_GET, args, new BoardRowMapper());
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> BoardDAOSpring2 - Spring JDBC getBoardList");
		String query = BOARD_LIST;
		if (vo.getSearchCondition() != null && vo.getSearchCondition().isEmpty() == false) {
			Object[] args = {vo.getSearchKeyword()};
			if (vo.getSearchCondition().equals("TITLE"))
				query = BOARD_LIST_T;
			else
				query = BOARD_LIST_C;
			return jdbcTemplate.query(query, args, new BoardRowMapper());
		}
		return jdbcTemplate.query(query, new BoardRowMapper());
	}
}
