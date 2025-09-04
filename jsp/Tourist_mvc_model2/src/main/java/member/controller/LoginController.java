package member.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import member.dao.MemberDAO;
import member.dto.MemberDTO;
import utils.JSFunction;

@WebServlet("/login.do")
public class LoginController extends HttpServlet {
	

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/login.jsp")
		.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String pw = req.getParameter("pw"); // login.jsp 화면에서 보내준 id, pw를 저장
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.getMember(id, pw);
		if (dto.getId() != null && dto.getId().equals(id)) { // SELECT문의 실행 결과로 회원 데이터가 있는지 확인
			HttpSession session = req.getSession(); // 세션에 userId를 저장
			session.setAttribute("userId", id);
			session.setAttribute("userDTO", dto);
			resp.sendRedirect("/Tourist_mvc_model2/"); // 로그인 성공시 메인 페이지(index)로 이동
		} else { // 아이디나 비밀번호가 틀렸을 경우 에러메세지 설정
			req.setAttribute("loginErrMsg", "아이디나 비밀번호를 확인해주세요.");
			req.getRequestDispatcher("/login.jsp").forward(req, resp); // 다시 로그인 페이지로 이동
		}
		
	}
}










