<%@page import="common.JDBConnect"%>
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
	JDBConnect jdbc = new JDBConnect();
	
	String title = "test1";
	String content = "1111";
	String id = "musthave";
	
	String sql = "INSERT INTO board VALUES (SEQ_BOARD_NUM.nextval, ?, ?, ?, sysdate, 0)";
	
	jdbc.psmt = jdbc.con.prepareStatement(sql);
	jdbc.psmt.setString(1, title);
	jdbc.psmt.setString(2, content);
	jdbc.psmt.setString(3, id);
	
	int inResult = jdbc.psmt.executeUpdate();
	out.println(inResult + "행이 입력되었습니다.");
	
	jdbc.close();
	%>
</body>
</html>