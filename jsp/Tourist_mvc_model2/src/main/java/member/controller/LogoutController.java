package member.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logout.do")
public class LogoutController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(); // request에 있는 세션을 꺼내어 저장
		session.invalidate(); // session에 저장된 모든 데이터 삭제
		resp.sendRedirect("/Tourist_mvc_model2/"); // 로그아웃 처리 후 실행할 페이지
	}
	

}
