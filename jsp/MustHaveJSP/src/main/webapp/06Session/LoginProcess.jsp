<%@ page import="membership.MemberDTO" %>
<%@ page import="membership.MemberDAO" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userID = request.getParameter("user_id");
	String userPwd = request.getParameter("user_pw");
	
	MemberDAO dao = new MemberDAO();
	MemberDTO memberDTO = dao.getMemberDTO(userID, userPwd);
	dao.close();
	
	if(memberDTO.getId() != null) {
		session.setAttribute("UserId", memberDTO.getId());
		session.setAttribute("UserName", memberDTO.getName());
		response.sendRedirect("LoginForm.jsp");
	} else {
		request.setAttribute("LoginErrMsg", "로그인 오류 입니다.");
		request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
	}
%>