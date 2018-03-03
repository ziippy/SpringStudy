package com.springbook.view.board;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardService;

@Controller
@SessionAttributes("board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/insertBoard.do")
	//public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
	public String insertBoard(BoardVO vo) throws IOException {		// BoardDAO 를 직접 사용하는 것을 피하라
		// 파일 업로드 처리
		MultipartFile uploadFile = vo.getUploadFile();
		if (uploadFile != null && !uploadFile.isEmpty()) {
			String fileName = uploadFile.getOriginalFilename();
			uploadFile.transferTo(new File("D:/" + fileName));
		}
		//boardDAO.insertBoard(vo);
		boardService.insertBoard(vo);
		return "redirect:getBoardList.do";
	}
	
	@RequestMapping("/updateBoard.do")
	//public String updateBoard(@ModelAttribute("board") BoardVO vo, BoardDAO boardDAO) {
	public String updateBoard(@ModelAttribute("board") BoardVO vo) {
		//boardDAO.updateBoard(vo);
		boardService.updateBoard(vo);
		return "redirect:getBoardList.do";
	}
	
	@RequestMapping("/deleteBoard.do")
	//public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
	public String deleteBoard(BoardVO vo) {
		//boardDAO.deleteBoard(vo);
		boardService.deleteBoard(vo);
		return "redirect:getBoardList.do";
	}
	
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("제목", "TITLE");
		conditionMap.put("내용", "CONTENT");
		return conditionMap;
	}
	
	@RequestMapping("/getBoardList.do")
	/*
	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		mav.addObject("boardList", boardDAO.getBoardList(vo));
		mav.setViewName("getBoardList.jsp");
		return mav;
	}
	*/
	/*
	public String getBoardList(BoardVO vo, BoardDAO boardDAO, Model model) {
		model.addAttribute("boardList", boardDAO.getBoardList(vo));
		return "getBoardList.jsp";
	}
	*/
	//public String getBoardList(@RequestParam(value="searchCondition", defaultValue="TITLE", required=false) String condition,
	//		@RequestParam(value="searchKeyword", defaultValue="", required=false) String keyword, 
	//		BoardDAO boardDAO, Model model) {
	public String getBoardList(@RequestParam(value="searchCondition", defaultValue="TITLE", required=false) String condition,
			@RequestParam(value="searchKeyword", defaultValue="", required=false) String keyword, 
			Model model) {
		BoardVO vo = new BoardVO();
		if (!keyword.isEmpty()) {
			vo.setSearchCondition(condition);
			vo.setSearchKeyword(keyword);
		}
		//model.addAttribute("boardList", boardDAO.getBoardList(vo));
		model.addAttribute("boardList", boardService.getBoardList(vo));
		return "getBoardList.jsp";
	}
	
	@RequestMapping("/getBoard.do")
	/*
	public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		mav.addObject("board", boardDAO.getBoard(vo));
		mav.setViewName("getBoard.jsp");
		return mav;
	}
	*/
	//public String getBoard(BoardVO vo, BoardDAO boardDAO, Model model) {
	public String getBoard(BoardVO vo, Model model) {
		//model.addAttribute("board", boardDAO.getBoard(vo));
		model.addAttribute("board", boardService.getBoard(vo));
		return "getBoard.jsp";
	}
	
	@RequestMapping("/dataTransform.do")
	@ResponseBody
	public List<BoardVO> dataTransform(BoardVO vo) {
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		List<BoardVO> boardList = boardService.getBoardList(vo);
		return boardList;
	}
}
