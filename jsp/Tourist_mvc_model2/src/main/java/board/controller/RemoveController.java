package board.controller;

import java.io.IOException;

import board.dao.BoardDAO;
import board.dto.BoardDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utils.JSFunction;

@WebServlet("/boardremove.do")
public class RemoveController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num = Integer.parseInt(req.getParameter("num")); // Primary Key인 num 데이터를 저장
		
		BoardDAO dao = new BoardDAO(); // 삭제 쿼리문을 실행
		
		String userId = req.getSession().getAttribute("userId").toString();
		int result = 0;
		
		BoardDTO dto = dao.selectView(num);
		// 로그인한 유저와 게시글을 작성한 유저가 동일한지 확인
		if(userId.equals(dto.getId())) {
			result = dao.deleteBoard(num);
		}
		
		if(result == 1) {
			resp.sendRedirect("./boardList.do");
		} else {
			JSFunction.alertBack(resp, "삭제가 실패했습니다.");
		}
		dao.close();
	}

}
