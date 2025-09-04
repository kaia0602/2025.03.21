<%@page import="common.JDBConnect"%>
<%@page import="common.JDBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC</title>
</head>
<body>
	<h2>테스트1</h2>
	<%
	JDBConnect jdbc1 = new JDBConnect();
			jdbc1.close();
	%>
	<h2>커넥션 풀 테스트</h2>
	<%
	JDBConnect pool = new JDBConnect();
			pool.close();
	%>
</body>
</html>