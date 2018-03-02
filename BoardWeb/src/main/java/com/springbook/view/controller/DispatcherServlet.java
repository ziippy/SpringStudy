package com.springbook.view.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispatcherServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		process(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 1. Ŭ���̾�Ʈ�� ��û path ������ �����Ѵ�.
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		System.out.println(path);
		
		// 2. Ŭ���̾�Ʈ ��û path �� �ٶ� ������ �б�ó�� �Ѵ�.
		if (path.equals("/login.do")) {
			System.out.println("login ó��");
		} else if (path.equals("/logout.do")) {
			System.out.println("logout ó��");
		} else if (path.equals("/insertBoard.do")) {
			System.out.println("insertBoard ó��");
		} else if (path.equals("/updateBoard.do")) {
			System.out.println("updateBoard ó��");
		} else if (path.equals("/deleteBoard.do")) {
			System.out.println("deleteBoard ó��");
		} else if (path.equals("/getBoard.do")) {
			System.out.println("getBoard ó��");
		} else if (path.equals("/getBoardList.do")) {
			System.out.println("getBoardList ó��");
		}
	}

}
