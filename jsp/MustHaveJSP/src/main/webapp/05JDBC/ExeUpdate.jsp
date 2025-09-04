<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.Connection"%>
<%@ page import="common.JDBConnect" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC</title>
</head>
<body>
	<h2>회원 추가 테스트(executeUpdate() 사용)</h2>
	<%
		JDBConnect jdbc = new JDBConnect();
		
		String id = "test1";
		String pass = "1111";
		String name = "테스트1회원";
		
		// SQL문 작성부분: 쿼리문 안의 ? -> 변수를 설정할 수 있음
		String sql = "INSERT INTO member VALUES (?, ?, ?, sysdate)";
		// prepareStatement 객체 생성: 생성시 실행할 SQL문을 넣어야함
		jdbc.psmt = jdbc.con.prepareStatement(sql);
		// setString(?의 위치값, ?에 대입할 데이터): SQL문의 ? 데이터 설정
		jdbc.psmt.setString(1, id);
		jdbc.psmt.setString(2, pass);
		jdbc.psmt.setString(3, name);
		// "INSERT INTO member VALUES ('test1', '1111', '테스트1회원', sysdate)"
		
		// executeUpdate(); 위에서 설정한 SQL문을 실행
		// insert, update, delete만 실행해야함 
		// psmt.executeQuery(): SELECT문을 실행하는 메서드
		int inResult = jdbc.psmt.executeUpdate();
		out.println(inResult + "행이 입력되었습니다.");
		
		jdbc.close();
	%>
</body>
</html>