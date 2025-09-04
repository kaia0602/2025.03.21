<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="common.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>포워드로 전달된 페이지</h2>
	<%
		Person rPerson = (Person)(request.getAttribute("requestPerson"));
	%>
	
	<ul>
		<li>String 객체 : <%= request.getAttribute("requestString") %></li>
		<li>Person 객체 : <%= rPerson.getName()%>, <%=rPerson.getAge() %></li>
	</ul>
	
	<h2>매개변수로 전달된 값 출력하기</h2>
	<%
		
		request.setCharacterEncoding("UTF-8");
		out.print(request.getParameter("han"));
		out.print(request.getParameter("eng"));
	%>
</body>
</html>