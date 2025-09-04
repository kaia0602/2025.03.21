<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.Statement"%>
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
	<h2>회원 목록 조회 테스트(executeQuery() 사용)</h2>
	
	<%
		JDBConnect jdbc = new JDBConnect();
	
		// Statement 사용시 ?를 사용할 수 없어 SQL문을 완전하게 만들어야함
		String sql = "SELECT id, pass, name, regidate FROM member";
		jdbc.stmt = jdbc.con.createStatement();
		
		// Statement의 경우 실행시 sql을 설정함 
		jdbc.rs = jdbc.stmt.executeQuery(sql);
		
		// rs에 select문의 결과가 들어 있고 
		// re.next()를 이용하여 데이터가 있는지 확인하고
		// 데이터를 사용
		while (jdbc.rs.next()) {
			// rs.getString(1): 1번째 열인 id를 반환
			String id = jdbc.rs.getString(1);
			// rs.getString(2): 2번째 열인 pw를 반환
			String pw = jdbc.rs.getString(2);
			// jdbc.rs.getString("name"): name을 반환
			String name = jdbc.rs.getString("name");
			// jdbc.rs.getDate("regidate"): regidate를 반환
			java.sql.Date regiDate = jdbc.rs.getDate("regidate");
			
			out.println(String.format("%s %s %s %s", id, pw, name, regiDate) +
					"<br/>");
		}
		
		jdbc.close();
	%>
</body>
</html>