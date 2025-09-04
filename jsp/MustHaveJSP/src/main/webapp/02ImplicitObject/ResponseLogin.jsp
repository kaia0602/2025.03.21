<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// getParameter을 이용하여 id의 password를 변수에 저장
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		// id가 must 이고 password가 1234이면 로그인 성공 페이지로 이동
		if(id.equalsIgnoreCase("must") && pw.equalsIgnoreCase("1234")) {
			// 다시한번 요청을 진행하는 sendRedirect: 주소창이 변경됨, request, response는 재사용 못함
			response.sendRedirect("ResponseWelcome.jsp");
		} else {
			// 요청을 그대로 가지고 다음 페이지로 진행하는 forword: 주소창 변경 없음
			// request, response 그대로 사용가능
			request.getRequestDispatcher("ResponseMain.jsp?loginErr=1")
			.forward(request, response);
		}
	%>
</body>
</html>