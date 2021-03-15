package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.webapp.dto.Board;

public class Controller05 {


	public String getBoardList(HttpServletRequest request, HttpServletResponse response) {
		//요청 내용을 확인
		System.out.println(request.getRemoteHost());

		//
		List<Board> list = new ArrayList<Board>();
		for(int i=1; i<=10; i++) {
			Board board = new Board();
			board.setBno(i);
			board.setBtitle("제목"+i);
			board.setBcontent("내용"+i);
			board.setBwriter("spring");
			list.add(board);
		}
		request.setAttribute("list", list);
		
		return "view052";
	}
}
