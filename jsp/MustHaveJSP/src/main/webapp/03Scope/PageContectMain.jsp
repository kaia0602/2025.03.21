<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="common.Person" %> 
<%
	// page 영역에 데이터를 key, value 형식으로 저장
	pageContext.setAttribute("pageInteger",1000);
	pageContext.setAttribute("pageString","페이지 영역의 문자열");
	pageContext.setAttribute("pagePerson",new Person("한석봉 ", 99));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>page 영역의 속성값 읽기</h2>
	<%
		// getAttribue(key): page 영역에 key에 맞는 데이터를 반환
		// 캐스팅을 해야 변수에 저장 가능
		int pInteger = (Integer)(pageContext.getAttribute("pageInteger"));
		String pString = (String)(pageContext.getAttribute("pageString"));
		Person pPerson = (Person)(pageContext.getAttribute("pagePerson"));
	%>
	<ul>
		<%-- 에러가 발생하고 있으나 실핼했을시 문제없이 데이터가 출력됨 --%>
		<li>Integer 객체 : <%=pInteger %></li>
		<li>String 객체 : <%=pString %></li>
		<li>Person 객체 : <%=pPerson.getName() %>,<%=pPerson.getAge()%></li>
	</ul>
	
	<h2>include 된 파일에서 page 영역 읽어오기</h2>
	<%-- page 영역에 저장한 데이터는 include 한 페이지에서도 사용할 수 있다 --%>
	<%@ include file="PageInclude.jsp" %>
	
	<h2>페이지 이동후 page 영역 읽어오기</h2>
	<a href="PageLocation.jsp">PageLocation.jsp</a>
</body>
</html>