<%@page import="member.dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	MemberDAO dao = new MemberDAO();
	 String id = request.getParameter("id");
	 String email = request.getParameter("email");
	 String name = request.getParameter("name");
	 String password = request.getParameter("password");
	 String phone = request.getParameter("phone");
	 String gender = request.getParameter("gender");
	 int agree= request.getParameter("agree") == null ? 0 : 1; 
	 String content = request.getParameter("content");
	 
	 dao.memberInsert(id, email, name, password, phone, gender, agree, content);
	 response.sendRedirect("index.jsp");
%>
