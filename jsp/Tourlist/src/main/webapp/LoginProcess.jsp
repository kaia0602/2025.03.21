<%@ page import="member.dto.MemberDTO" %>
<%@ page import="member.dao.MemberDAO" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String userID = request.getParameter("id");
String userPwd = request.getParameter("pw");

MemberDAO dao = new MemberDAO();
MemberDTO memberDTO = dao.getMember(userID, userPwd);
dao.close();

if(memberDTO.getId() != null) {
	session.setAttribute("UserId", memberDTO.getId());
	session.setAttribute("UserName", memberDTO.getName());
	response.sendRedirect("index.jsp");
} else {
	request.setAttribute("LoginErrMsg", "아이디나 비밀번호를 다시 확인해주세요.");
	request.getRequestDispatcher("Login.jsp").forward(request, response);
}

%>