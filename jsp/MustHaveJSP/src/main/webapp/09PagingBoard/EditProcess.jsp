<%@ page import = "model1.board.BoardDAO" %>
<%@ page import = "model1.board.BoardDTO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "./IsLoggedIn.jsp" %>

<%
	// Edit 페이지의 form태그에서 전달한 데이터를 저장
	String num = request.getParameter("num");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	
	// DAO에서 사용할 DTO를 생성
	BoardDTO dto = new BoardDTO();
	
	// DTO에 num, title, content 데이터를 저장
	dto.setNum(Integer.parseInt(num)) ;
	dto.setTitle(title);
	dto.setContent(content);
	
	// DB에 SQL을 실행할 DAO를 설정
	BoardDAO dao = new BoardDAO();
	// update문 실행
	int affected = dao.updateEdit(dto);
	dao.close();
	
	// update 결과가 1이면 정상실행, 그외의 숫자는 에러발생
	if (affected == 1) {
		// 정상 실행히면 상세보기 페이지로 진행
		response.sendRedirect("View.jsp?num=" + dto.getNum());
	} else {
		// 실패했다면 이전 페이지로 뒤로가기를 실행
		JSFunction.alertBack("수정하기에 실패 하였습니다.", out);
	}
%>
