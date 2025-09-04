<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="common.Person" %>
<%
	request.setAttribute("requestString", "request 영역의 문자열");
	request.setAttribute("requestPerson", new Person("안중근", 31));
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>request 영역의 속성값 제거하기</h2>
	<%
		// request에 저장된 속성 삭제하기
		request.removeAttribute("requstString");
		// request에 속성이 없어도 에러가 나지 않는다. 
		request.removeAttribute("requstInteger");
	%>
	
	<h2>request 영역의 속성값 읽기</h2>
	<%
		Person rPerson = (Person)(request.getAttribute("requestPerson"));
	%>
	
	<ul>
		<li>String 객체 : <%= request.getAttribute("requestString") %></li>
		<li>Person 객체 : <%= rPerson.getName()%>, <%=rPerson.getAge() %></li>
	</ul>
	<%
		// foward의 경우 request의 데이터와 parameter 데이터를 전달 받을 수 있다.
		request.getRequestDispatcher("RequestForward.jsp?han=한글&eng=영어")
		.forward(request, response);
		// sendRedirect의 경우 parameter 데이터만 던잘 할 수 있음
		// response.sendRedirect("RequestFoward.jsp?han=한글&eng=영어");
	%>
</body>
</html>