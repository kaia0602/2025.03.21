package board.controller;

import java.io.IOException;

import board.dao.BoardDAO;
import board.dto.BoardDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/boardview.do")
public class ViewController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num = Integer.parseInt(req.getParameter("num")); // 게시글 번호 파라미터 저장
	
		BoardDAO dao = new BoardDAO(); // DB에 접속하여 쿼리 실행
		dao.updateVisitCount(num); // 조회수 증가 쿼리
		
		BoardDTO dto = dao.selectView(num); // 게시글 데이터를 받아오는 쿼리
		dto.setContent(dto.getContent().replaceAll("(\r\n|\r|\n)", "<br/>")); // 엔터키를 br태그로 변경
		
		req.setAttribute("dto", dto); // request에 dto의 데이터를 저장
		req.getRequestDispatcher("/board_view.jsp").forward(req, resp); // board_view.jsp를 실행
		
		
		dao.close();
	}

}
