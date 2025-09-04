<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="IsErrorPage.jsp"%>
<!-- 에러 발생시 errorPage 속성에 설정한 페이지로 이동하게 됨 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page - 지시어 - errorPage, isErrorPage 속성</title>
</head>
<body>
	<%
	// 에러 발생시 JSP에서 지원하는 에러 페이지가 출력되며 에러의 모든 내용 및 원인을 출력한다.
	// JSP 에러 페이지를 출력하지 않으려면 try/catch 혹은 errorPage 설정을 해야함
	int myAge = Integer.parseInt(request.getParameter("age"));
	out.println("10년 후 당신의 나이는 " + myAge + "입니다.");
	%>

</body>
</html>