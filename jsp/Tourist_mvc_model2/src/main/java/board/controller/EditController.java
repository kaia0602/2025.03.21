package board.controller;

import java.io.IOException;

import board.dao.BoardDAO;
import board.dto.BoardDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import utils.JSFunction;

@WebServlet("/boardedit.do")
public class EditController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	// 상세보기처럼 1개의 게시글를 저장하여 edit페이지로 전달
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num = Integer.parseInt(req.getParameter("num")); // Primary Key를 파라미터로 받음
		BoardDAO dao = new BoardDAO();
		
		BoardDTO dto = dao.selectView(num); // select 쿼리를 실행, dto에 데이터를 저장
		req.setAttribute("dto", dto); // jsp에서 사용 할수있도록 request에 데이터를 저장
		
		req.getRequestDispatcher("/board_edit.jsp").forward(req, resp); // jsp파일을 실행
	}
	
	// 수정된 데이터를 받아서 UPDATE문을 실행하고 상세보기 페이지로 이동
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		if(session.getAttribute("userId") == null){
			JSFunction.alertLocation(resp, "로그인 후 이용해주십시오",
					"login.jsp");
			return;
		}
		
		int num = Integer.parseInt(req.getParameter("num")); // 화면에서 보내주는 파라미터를 저장
		String title = req.getParameter("title");
		String content = req.getParameter("content");

		BoardDTO dto = new BoardDTO(); // 파라미터로 수정할 데이터를 dto에 저장
		dto.setNum(num);
		dto.setTitle(title);
		dto.setContent(content);

		BoardDAO dao = new BoardDAO();
		int result = dao.updateBoard(dto); // dto의 데이터로 update문 실행
		if(result == 1){
			resp.sendRedirect("./boardview.do?num="+dto.getNum());
		}else{
			JSFunction.alertBack(resp, "수정에 실패했습니다.");
		}

	}
}
