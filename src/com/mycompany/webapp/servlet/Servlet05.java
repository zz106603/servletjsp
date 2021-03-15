package com.mycompany.webapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller05;

public class Servlet05 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("servlet03 - service() 메소드 실행");
		

		//컨트롤러 생성 및 요청 처리 메소드 호출
		Controller05 controller = new Controller05();
		String viewName = controller.getBoardList(request, response);
		
		//응답 내용을 생성 및 전송
		String prefix = "/WEB-INF/views/";
		String suffix = ".jsp";
		RequestDispatcher rd = request.getRequestDispatcher(prefix + viewName + suffix);
		rd.forward(request, response);
	}
}
